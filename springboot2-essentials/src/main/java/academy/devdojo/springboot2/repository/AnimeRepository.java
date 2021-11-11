package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//conxão com  o bd - queries e todas as coisas ficam aqui
public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
