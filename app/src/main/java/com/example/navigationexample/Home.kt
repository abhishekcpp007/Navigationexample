package com.example.navigationexample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun  HomeScreenUI(navController: NavHostController) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.tertiary)
    ) {


        Text(
            text = "Sample",
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.inversePrimary
        )
        Button(onClick = {
            navController.navigate(Destination.Samplescreen.route)
        }) {
            Text(text = "click here for next")

        }

    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
 //   HomeScreenUI(navController)
}