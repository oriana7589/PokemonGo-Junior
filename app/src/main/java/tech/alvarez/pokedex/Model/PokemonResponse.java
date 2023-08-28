package tech.alvarez.pokedex.Model;

import java.util.ArrayList;

/**
 * Created by Daniel Alvarez on 28/7/16.
 * Copyright © 2016 Alvarez.tech. All rights reserved.
 */
public class PokemonResponse {

    private ArrayList<Pokemons> results;

    public ArrayList<Pokemons> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemons> results) {
        this.results = results;
    }
}
