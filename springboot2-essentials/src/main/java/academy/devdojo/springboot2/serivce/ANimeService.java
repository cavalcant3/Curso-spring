package academy.devdojo.springboot2.serivce;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.repository.AnimeRepository;
import academy.devdojo.springboot2.requests.AnimePostRequestBody;
import academy.devdojo.springboot2.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//responsavel pela lógica do banco de dados
@Service
@RequiredArgsConstructor
public class ANimeService {

    private final AnimeRepository animeRepository;

    public ANimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    public List<Anime> listAll(){
            return animeRepository.findAll();
    }
    public Anime findByIdOrThrowBadRequestException(long id){
            return animeRepository.findById(id)
                            .orElseThrow(()-> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime não encontrado"));
    }

    public Anime save(AnimePostRequestBody animePostRequestBody) {

            return animeRepository.save(Anime.builder().name(animePostRequestBody.getName()).build());
        }

    public void delete(long id) {
            animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
          Anime savedAnime =  findByIdOrThrowBadRequestException(animePutRequestBody.getId());
          Anime anime = Anime.builder()
                    .id(savedAnime.getId())
                    .name(animePutRequestBody.getName()
                    .build();
            animeRepository.save(anime);
            delete(anime.getId());
            animes.add(anime);
    }
}
