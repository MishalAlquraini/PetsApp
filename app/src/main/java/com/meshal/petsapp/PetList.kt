package com.meshal.petsapp

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PetsList(viewModel: PetViewModel = viewModel(), modifier: Modifier = Modifier){
    val pets = viewModel.pets
    LazyColumn (modifier = modifier){
        items(pets){
            PetsCard(it)
        }
    }



}