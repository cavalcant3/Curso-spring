package academy.devdojo.springboot2.controller;


import academy.devdojo.springboot2.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //isso é uma restapi
@RequestMapping("anime")
public class AnimeController {
    //localhost:8080/anime/list
    @GetMapping(path = "list") //endpoint .../list
    public List<Anime> list(){
        return List.of(new Anime("DBZ"), new Anime("Bersek"));
    }
}
