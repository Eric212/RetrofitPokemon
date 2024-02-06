package com.ericsospedra.retrofitpokemon.models;

import com.ericsospedra.retrofitpokemon.interfaces.IApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitPokemon {
    private static final String BASE_URL = "https://pokeapi.co/api/v2/";

    private static IApiService instance;

    private RetrofitPokemon() {

    }
    public synchronized static IApiService getInstance(){
        if(instance == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            instance = retrofit.create(IApiService.class);
        }
        return instance;
    }
}
