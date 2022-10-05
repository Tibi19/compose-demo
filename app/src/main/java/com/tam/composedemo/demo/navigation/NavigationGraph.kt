package com.tam.composedemo.demo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.tam.composedemo.demo.navigation.screens.ArgumentScreen
import com.tam.composedemo.demo.navigation.screens.HomeScreen

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Destination.Home.route
    ) {
        composable(Destination.Home.route) {
            val goToArgScreenLambda: (argument: Int) -> Unit = {
                val argScreenRoute = Destination.ScreenWithArgument.createRoute(it)
                navController.navigate(argScreenRoute)
            }
            HomeScreen(goToArgScreen = goToArgScreenLambda)
        }

        composable(
            route = Destination.ScreenWithArgument.route,
            arguments = listOf(
                navArgument(ARG_KEY) { type = NavType.IntType }
            )
        ) {
            Destination.ScreenWithArgument.createRoute(1)
            val argument = it.arguments?.getInt(ARG_KEY)
            if(argument != null) {
                ArgumentScreen(argument = argument)
            }
        }
    }
}