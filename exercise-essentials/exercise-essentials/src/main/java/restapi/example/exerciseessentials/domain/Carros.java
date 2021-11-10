package restapi.example.exerciseessentials.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Carros {
    private Long id;
    private String marca;
    private Integer ano;
    private Long preco;


}
