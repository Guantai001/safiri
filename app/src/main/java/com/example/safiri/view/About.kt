package com.example.safiri.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.safiri.R

@Composable
fun About() {
    Column {

        Image(
            painter = painterResource(id = R.drawable.about_header),
            contentDescription ="About Safiri",
            modifier = Modifier
                .fillMaxWidth()


        )
        Text(
            text ="Msafiri is an online bus-ticketing organization with " +
                    "presence in kenya looking to branch the rest of africa within the next few years. " +
                    "It simplifies travel for people at a global level, we believe in finding solutions through innovation. The pride of msafiri " +
                    "lies in the in-house talent of dynamic, intelligent and passionate individuals who come from various fields of expertise." +
                    " Msafiri provides travellers with the most uncomplicated and hassle-free booking experience ever. Choose your destination," +
                    " select car based on user ratings, view the seat layout, choose convenient seats, and book your ticket in just a few clicks!",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

    }

}