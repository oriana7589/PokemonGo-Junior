package tech.alvarez.pokedex.Interface;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import tech.alvarez.pokedex.Model.PokemonDescription;
import tech.alvarez.pokedex.Model.PokemonDescriptionResponse;
import tech.alvarez.pokedex.Model.PokemonResponse;

/**
 * Created by Daniel Alvarez on 28/7/16.
 * Copyright © 2016 Alvarez.tech. All rights reserved.
 */
public interface PokemonService {

    @GET("pokemon/")
    Call<PokemonResponse> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);

    @GET("pokemon/{name}")
    Call<PokemonDescription> obtenerDescriptionPokemon(@Path("name") String name);

}
