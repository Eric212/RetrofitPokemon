package com.ericsospedra.retrofitpokemon.interfaces;

import com.ericsospedra.retrofitpokemon.models.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IApiService {

    @GET("pokemon?limit=151")
    public Call<List<Pokemon>> getAllFirstGenerationPokemons();

}
