package pokemonGo.Ramos.junior.Interface;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import pokemonGo.Ramos.junior.Model.PokemonDescription;
import pokemonGo.Ramos.junior.Model.PokemonResponse;

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
