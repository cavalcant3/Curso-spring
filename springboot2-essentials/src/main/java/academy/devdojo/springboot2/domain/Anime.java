package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

//responsavel pelo o que temos no banco de dados
@Data
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;

    //metodo para receber os parametros


    //metodo para buscar id unico
    public Long getId() {
        return id;
    }


    public void setId(long nextLong) {

    }
}
