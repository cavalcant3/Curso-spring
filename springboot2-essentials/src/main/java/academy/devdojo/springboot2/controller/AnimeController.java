package academy.devdojo.springboot2.controller;


import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.serivce.ANimeService;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//classe responsavel pelos endpoints

@RestController //isso é uma restapi
@RequestMapping("anime")
@Log4j2
//@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;
    private final ANimeService animeService;

    public AnimeController(DateUtil dateUtil, ANimeService animeService) {
        this.dateUtil = dateUtil;
        this.animeService = animeService;
    }


    //localhost:8080/anime/list
    @GetMapping //(path = "list") //endpoint .../list
    public ResponseEntity<List<Anime>> list(){
        log.info(dateUtil.formatLocalDateToDataBaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll());
    }

    @GetMapping(path = "/{id}") //endpoint
    public ResponseEntity<Anime> findById(@PathVariable long id) {
        return ResponseEntity.ok(animeService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody Anime anime){
        return ResponseEntity.ok(animeService.save(anime));
    }
    @DeleteMapping(path = "/{id}") //endpoint
    public ResponseEntity<Void> delete(@PathVariable long id) {
        animeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}") //endpoint
    public ResponseEntity<Void> replace(@RequestBody Anime anime) {
        animeService.replace(anime);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    private static final Logger log = LoggerFactory.getLogger(AnimeController.class);
}
