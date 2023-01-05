package com.example.safiri.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.safiri.R

@Composable
fun LoginScreen(
//    navController: NavController
) {
    var value by remember { mutableStateOf("") }

    var passwordVisibility by remember { mutableStateOf(false) }

    // Creating a variable to store password
    var password by remember { mutableStateOf("") }

    // Creating a variable to store toggle state
    var passwordVisible by remember { mutableStateOf(false) }
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
      value  = value,
      onValueChange = { newText -> value = newText },
      singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp)
            ,
        label = { Text(text = "Email") },
      leadingIcon = {
          Icon(
              imageVector = Icons.Default.Email,
              contentDescription = "Email Icon",
              tint = colors.primary
          )
      },
      )
    //passwordTextField()
    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        singleLine = true,
        label = { Text(text = "Password") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp),
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

        trailingIcon = {
            val image = if (passwordVisible)
                Icons.Filled.Visibility
            else Icons.Filled.VisibilityOff

            // Localized description for accessibility services
            val description = if (passwordVisible) "Hide password" else "Show password"

            // Toggle button to hide or display password
            IconButton(onClick = {passwordVisible = !passwordVisible}){
                Icon(
                    imageVector  = image,
                    tint = colors.primary,
                    contentDescription = description
                )
            }
        }

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


