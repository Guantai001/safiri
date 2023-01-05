package com.example.safiri.view

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.safiri.R

@Composable
fun Register() {
    val scrollState = rememberScrollState()
    var firstName by remember { mutableStateOf("") }
    var secondName by remember { mutableStateOf("") }
    var mail by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var idNumber by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    // Creating a variable to store password
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    // Creating a variable to store toggle state
    var passwordVisible by remember { mutableStateOf(false) }
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(scrollState)

            ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                .size(100.dp)
        )
        Text(
            text = "Welcome to Msafiri",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h5,
            color = MaterialTheme.colors.primary,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        )
        //name text field
        OutlinedTextField(
            value = firstName,
            onValueChange = { newText -> firstName = newText },
            label = { Text(text = "FirstName") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Person",
                    tint = MaterialTheme.colors.primary
                )
            }
        )
        //last name text field
        OutlinedTextField(
            value = secondName,
            onValueChange = {newText -> secondName = newText  },
            label = { Text(text = "LastName") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Person",
                    tint = MaterialTheme.colors.primary
                )
            }
        )
//    emailTextField()
        OutlinedTextField(
            value  = mail,
            onValueChange = { newText -> mail= newText },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp,end = 16.dp)
            ,
            label = { Text(text = "Email") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon",
                    tint = MaterialTheme.colors.primary
                )
            },

            )
        //phone number text field
        OutlinedTextField(
            value = phoneNumber,
            onValueChange = { newText -> phoneNumber = newText },
            label = { Text(text = "Phone Number") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = "Person",
                    tint = MaterialTheme.colors.primary
                )
            }
        )
        //id number text field
        OutlinedTextField(
            value = idNumber,
            onValueChange = { newText -> idNumber = newText },
            label = { Text(text = "ID Number") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.ConfirmationNumber,
                    contentDescription = "Person",
                    tint = MaterialTheme.colors.primary
                )
            }
        )

        //passwordTextField()
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            singleLine = true,
            label = { Text(text = "Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp,  end = 16.dp),
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
                        tint = MaterialTheme.colors.primary,
                        contentDescription = description
                    )
                }
            }

        )
        //confirm password text field
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            singleLine = true,
            label = { Text(text = "Confirm Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
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
                        tint = MaterialTheme.colors.primary,
                        contentDescription = description
                    )
                }
            }

        )
        Text(
            text = "By clicking Register, you agree to the",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        )
        //on click navigate to register screen
        Text(

            text = "Terms and Conditions",
            textAlign = TextAlign.Center,
            //bold
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.primary,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .clickable {  }

        )
        //Register button
        Button(
            onClick = {  },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        ) {
            Text(text = "Register")
        }

    }
}



