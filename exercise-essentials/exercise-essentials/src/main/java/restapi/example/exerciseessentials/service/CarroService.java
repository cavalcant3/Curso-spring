package restapi.example.exerciseessentials.service;

import org.springframework.stereotype.Service;
import restapi.example.exerciseessentials.domain.Carros;

import java.util.List;

@Service
public class CarroService {

    public List<Carros> listAll(){
        return List.of(new Carros(1L,"fusquinha",2020,100L), new Carros(2L,"corsa",2019,500L));
    };

}
