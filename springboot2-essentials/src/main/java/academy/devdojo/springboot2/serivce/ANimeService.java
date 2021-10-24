package academy.devdojo.springboot2.serivce;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//responsavel pela lógica do banco de dados
@Service
public class ANimeService {
    private static List<Anime> animes ;
        static {
            animes = new ArrayList<>(List.of(new Anime(1L, "DBZ"), new Anime(2L, "Bersek")));
        }

    public List<Anime> listAll(){
            return animes;
    }
    public Anime findById(long id){
            return animes.stream()
                    .filter(anime -> anime.getId() == id)
                    .findFirst()
                    .orElseThrow(()-> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime não encontrado"));
    }

    public Anime save(Anime anime) {
            anime.setId(ThreadLocalRandom.current().nextLong(3,1000));
            animes.add(anime);
            return anime;
        }

    public void delete(long id) {
            animes.remove(findById(id));
    }

    public void replace(Anime anime) {
            delete(anime.getId());
            animes.add(anime);
    }
}
