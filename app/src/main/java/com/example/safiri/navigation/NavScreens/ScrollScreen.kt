package com.example.safiri.navigation.NavScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController

@Composable
fun ScrollScreen() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    var navController = rememberNavController()

    Scaffold(
        scaffoldState= scaffoldState,
        topBar = { TopBarr(scaffoldState, scope) },
        content = {padding ->
            Box(modifier = Modifier.padding(padding)){
                NavigationGraph(navController = navController, scaffoldState = scaffoldState, scope = scope)
            }
        },
        drawerContent = {
  DrawerContent()
        },
        bottomBar = { BottomNavigationBar(navController) },

    )


}
