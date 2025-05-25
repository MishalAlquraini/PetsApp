package com.meshal.petsapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.meshal.petsapp.PetsDto.PetsDto
import kotlinx.coroutines.launch

class PetViewModel : ViewModel() {
    var pets by mutableStateOf(emptyList<PetsDto>())
    init {
        viewModelScope.launch {
          getPets()
        }
    }
    suspend fun getPets(){
        val client = RetrofitHelper.getInstance().create<PetsApiService>(PetsApiService::class.java)
        pets = client.getAllPets()

    }
}