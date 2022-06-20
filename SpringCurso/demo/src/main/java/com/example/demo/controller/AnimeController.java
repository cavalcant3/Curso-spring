package com.example.demo.controller;

import com.example.demo.domain.Anime;
import com.example.demo.service.AnimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor


public class AnimeController {

    private final AnimeService animeService;

    @GetMapping
    public List<Anime> list(){
        return animeService.listAll();
    }
}

