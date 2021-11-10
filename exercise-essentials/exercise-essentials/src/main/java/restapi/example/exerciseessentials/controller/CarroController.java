package restapi.example.exerciseessentials.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restapi.example.exerciseessentials.domain.Carros;
import restapi.example.exerciseessentials.service.CarroService;
import restapi.example.exerciseessentials.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("carros")
@Log4j2
@RequiredArgsConstructor
public class CarroController {
    private final CarroService carroService;
    private final DateUtil dateUtil;

    @GetMapping
    public List<Carros> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return carroService.listAll();
    }
}
