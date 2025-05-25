package com.meshal.petsapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.meshal.petsapp.PetsDto.PetsDto

@Composable
fun PetsCard(petsDto: PetsDto, modifier: Modifier = Modifier){
    Card (modifier){
        Row {
            AsyncImage(
                model = petsDto.image,
                contentDescription = petsDto.name
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text("${petsDto.name} ${petsDto.gender}")
                Text("${petsDto.adopted} ${petsDto.age}")

            }

        }
    }

}

@Preview
@Composable
fun BookCardPreview() {
    PetsCard(PetsDto(
        name = "Mimi",
        age = 1,
        adopted = "Yes",
        gender = "Female",
        image = "",
        id = 4
    ))
}