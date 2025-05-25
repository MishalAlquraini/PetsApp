package com.meshal.petsapp

import com.meshal.petsapp.PetsDto.PetsDto
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


object RetrofitHelper {
    fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://coded-pets-api-crud.eapi.joincoded.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}


interface PetsApiService {
    @GET("Pets")
    suspend fun getAllPets(): List<PetsDto>
}