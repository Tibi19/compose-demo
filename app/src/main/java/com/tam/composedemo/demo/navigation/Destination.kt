package com.tam.composedemo.demo.navigation

const val ARG_KEY = "arg_key"

sealed class Destination(val route: String) {

    object Home: Destination("home")

    object ScreenWithArgument: Destination("arg_screen/{$ARG_KEY}") {
        fun createRoute(argument: Int) = "arg_screen/$argument"
    }

}
