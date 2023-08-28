package tech.alvarez.pokedex.Model;

public class TypeX {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    @Override
    public String toString() {
        return "PokemonType {name=" + name + ", url=" + url + "}";
    }
}
