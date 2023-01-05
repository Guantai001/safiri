package com.example.safiri

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.safiri.navigation.NavScreens.MainScreen
import com.example.safiri.ui.theme.SafiriTheme
import com.example.safiri.view.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafiriTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
//                    NavHost(navController = navController, startDestination = "splash_screen") {
//                        composable("splash_screen") {
//                            SplashScreen(navController = navController)
//                        }
//                        composable("login_screen") {
//                            LoginScreen(navController = navController)
//                        }
//
//                    }
                    MainScreen()
                }
            }
        }
    }
}

