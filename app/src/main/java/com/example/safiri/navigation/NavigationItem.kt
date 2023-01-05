package com.example.safiri.navigation

import com.example.safiri.R

sealed class NavigationItem(
    var route: String,
    var icon: Int,
    var title: String

    ){
    object Home : NavigationItem("home", R.drawable.ic_baseline_home_24, "Home")
    object MyBooking : NavigationItem("mybooking", R.drawable.ic_baseline_card_travel_24, "My Booking")
    object Account : NavigationItem("account", R.drawable.ic_outline_account_circle_24, "Account")

}

