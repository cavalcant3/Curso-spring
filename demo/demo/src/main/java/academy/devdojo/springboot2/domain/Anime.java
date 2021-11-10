package academy.devdojo.springboot2.domain;

public class Anime {
    private String name;

    public Anime(String anime) {
        this.name = anime;
    }

    public Anime() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
