package academy.devdojo.springboot2.controller;


import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.serivce.ANimeService;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController //isso é uma restapi
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;
    private final ANimeService animeService;


    //localhost:8080/anime/list
    @GetMapping //(path = "list") //endpoint .../list
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateToDataBaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }
}
