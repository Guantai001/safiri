package com.example.safiri.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.safiri.R

@Composable
fun MainScreen(){
    Column (
        //background = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.primary)
            ){

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "About Safiri",
            modifier = Modifier
                .fillMaxWidth()
        )
    //create a card for the about safiri

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .height(90.dp)
                .clickable {
                           //TODO
                },
            elevation = 8.dp

        ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
            ,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
        Icon(
            painter = painterResource(id = R.drawable.bus_icon),
            contentDescription = "Bus Icon",
            modifier = Modifier
                .padding(16.dp)
                .size(45.dp)
                .align(Alignment.CenterVertically),
            tint = MaterialTheme.colors.primary
        )
        Text(
            text = "Book Bus",
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterVertically)
            ,
            style = MaterialTheme.typography.h6,
            fontFamily = MaterialTheme.typography.h6.fontFamily
        )
            Icon(
                painter = painterResource(id = R.drawable.next),
                contentDescription = "Bus Icon",
                modifier = Modifier
                    .padding(16.dp)
                    .size(45.dp)
                    .align(Alignment.CenterVertically),
                tint = MaterialTheme.colors.primary
            )

        }
        }
        //create a card for the about safiri

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .height(90.dp)
                .clickable {
                    //TODO
                },
            elevation = 8.dp

        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                ,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Icon(
                    painter = painterResource(id = R.drawable.hotel_icon),
                    contentDescription = "Bus Icon",
                    modifier = Modifier
                        .padding(16.dp)
                        .size(45.dp)
                        .align(Alignment.CenterVertically),
                    tint = MaterialTheme.colors.primary
                )
                Text(
                    text = "Book BnB",
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.CenterVertically)
                    ,
                    style = MaterialTheme.typography.h6,
                    fontFamily = MaterialTheme.typography.h6.fontFamily
                )
                Icon(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = "Bus Icon",
                    modifier = Modifier
                        .padding(16.dp)
                        .size(45.dp)
                        .align(Alignment.CenterVertically),
                    tint = MaterialTheme.colors.primary
                )

            }
        }
    }
}