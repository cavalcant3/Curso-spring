package academy.devdojo.springboot2.requests;

import lombok.Data;

@Data
public class AnimePutRequestBody {
    private String name;
    private Long id;
}
