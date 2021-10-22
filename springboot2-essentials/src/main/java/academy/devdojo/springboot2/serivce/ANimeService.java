package academy.devdojo.springboot2.serivce;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ANimeService {
    public List<Anime> listAll(){
            return List.of(new Anime(1L, "DBZ"), new Anime(2L, "Bersek"));
    }
}
