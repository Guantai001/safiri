package com.example.safiri.view

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.safiri.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController,
    modifier: Modifier = Modifier
        .fillMaxHeight(1f)
) {
    val scale = remember {
        androidx.compose.animation.core.Animatable(0.0f)
    }

    LaunchedEffect(
        key1 = true ,
    ) {
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(800, easing = {
                OvershootInterpolator(4f).getInterpolation(it)
            })
        )
        delay(800)
        navController.navigate("login_screen") {
            popUpTo("splash_screen") {
                inclusive = true
            }
        }
    }


    Box (
        modifier = modifier,

            ) {
        Image(
            painter = painterResource(id = R.drawable.splash),
            contentDescription = "Splash Screen",
            modifier = modifier,
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,

            ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(150.dp)
                        .align(Alignment.Center)
                )

            }
            Text(
                text = "Msafiri",
                color = Color.White,
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

            )
  Box (modifier=Modifier
      .fillMaxWidth()

  ) {
      Row(
          Modifier
                .fillMaxWidth(),
          horizontalArrangement = Arrangement.Center

      ) {
          Text(
              text ="Hustle",
                color = Color.White,
                style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .padding(end = 5.dp)

          )
          Text(
              text ="Free",
              color = Color.White,
              style = MaterialTheme.typography.h6,
              modifier = Modifier
                  .padding(end = 5.dp)

          )
          Text(
              text ="Booking",
              color = Color.White,
              style = MaterialTheme.typography.h6,
              modifier = Modifier
                  .padding(end = 5.dp)

          )
      }

  }

}


        }

    }
