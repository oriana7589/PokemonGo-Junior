package tech.alvarez.pokedex.Model;

import java.util.ArrayList;
import java.util.List;

public class PokemonDescriptionResponse {
    private List<PokemonDescription> results;

    public List<PokemonDescription> getResults() {
        return results;
    }

    public void setResults(List<PokemonDescription> results) {
        this.results = results;
    }

}
