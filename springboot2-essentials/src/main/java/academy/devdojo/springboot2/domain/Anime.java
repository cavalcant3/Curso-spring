package academy.devdojo.springboot2.domain;

import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//responsavel pelo o que temos no banco de dados
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public static Snippet builder() {
    }


    //metodo para receber os parametros


    //metodo para buscar id unico
    public Long getId() {
        return id;
    }


    public void setId(long nextLong) {

    }
}
