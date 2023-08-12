package com.example.navigationexample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun WelcomeScreenUI(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),//.background(Image(painter = painterResource(id = R.drawable.splashing_water_gradient_background_mobile_v5hlk4ta55rn5w3x), contentDescription = "1")),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text("Welcome")
        Button(onClick = {
            navController.navigate(Destination.Home.route)
        }) {
            Text(text = "click here")
            
        }
        
    }
    
}
@Composable
@Preview (showBackground =true)
fun WelcomePreview() {
   // WelcomeScreenUI(navController)

}