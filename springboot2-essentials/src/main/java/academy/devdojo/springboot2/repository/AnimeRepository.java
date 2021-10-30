package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//conexão direta (query) com o banco de dados
public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
