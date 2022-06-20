package com.example.demo.service;

import com.example.demo.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    public List<Anime> listAll(){
        return List.of(new Anime(1L,"aslsad"), new Anime(2L,"lafls"));
    }
}
