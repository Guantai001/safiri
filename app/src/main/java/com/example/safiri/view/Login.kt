package com.example.safiri.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.safiri.R

@Composable
fun LoginScreen(
    navController: NavController
) {
Column(
    modifier = Modifier
        .fillMaxSize()
        .padding(top = 30.dp)
) {

    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .size(100.dp)
    )
//    emailTextField()
  OutlinedTextField(
      value  = "",
      onValueChange = {  },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp)
            ,
        label = { Text(text = "Email")

        }

  )
    //passwordTextField()
    OutlinedTextField(
        value = "",
        onValueChange = {  },
        label = { Text(text = "Password") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp)
    )

    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
    {
        Text(text = "Login")

    }
    //dont have an account text

  Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
          ){
        Text(text = "Don't have an account?")
      //on click navigate to register screen
      Text(
          modifier = Modifier
              .clickable {  },
          text = "Register",
          color = colors.primary
      )
  }

}
}


