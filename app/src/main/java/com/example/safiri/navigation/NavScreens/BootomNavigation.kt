package com.example.safiri.navigation.NavScreens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.safiri.navigation.NavigationItem
import com.example.safiri.view.HomeScreen


@Composable
fun BottomNavigationBar(navController:NavController) {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.MyBooking,
        NavigationItem.Account,
    )
    BottomNavigation(
       backgroundColor =  Color.White,
        contentColor = Color.Green
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.Green,
                unselectedContentColor = Color.Green.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = { navController.navigate(item.route) {
                    navController.graph.startDestinationRoute?.let { route ->
                        popUpTo(route) { saveState = true }
                    }
                    launchSingleTop = true
                    restoreState = true
                } }
            )
        }
    }

}
@Composable
fun MainScreen() {
    var navController = rememberNavController()
    Scaffold (
        bottomBar = { BottomNavigationBar(navController) },
        content = {padding -> Box(modifier = Modifier.padding(padding)) {
            NavigationGraph(navController = navController)
        }
        },
            )
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route){
            HomeScreen()
        }

        composable(NavigationItem.MyBooking.route) {
            AccountScreen()
        }

        composable(NavigationItem.Account.route) {
            BookingScreen()
        }



    }
}
