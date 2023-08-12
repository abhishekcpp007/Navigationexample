package com.example.navigationexample

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

sealed class Destination(val route:String){
object welcome:Destination("welcome")
    object Home:Destination("home")
    object Samplescreen:Destination("Samplescreen")
}
@Composable
fun MyNavigationHost(
    navController:NavHostController
){
    NavHost(navController = navController,
        startDestination  = Destination.welcome.route ){
        composable(Destination.welcome.route){ WelcomeScreenUI(navController)}
        composable(Destination.Home.route){ HomeScreenUI(navController)}
        composable(Destination.Samplescreen.route ){ SampleScreenUI(navController) }

    }
}