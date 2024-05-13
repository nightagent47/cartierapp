package com.apk.cartier.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apk.cartier.ui.theme.navigation.ROUTE_ADD_CAR
import com.apk.cartier.ui.theme.navigation.ROUTE_VIEW_CAR

@Composable
fun HomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        var context= LocalContext.current
        //  var productdata=productviewmodel(navController,context)

        Text(text = "The Safest Way",
            color = Color.Black,
            fontFamily = FontFamily.Default,
            fontSize = 30.sp)
        Text(text = "To Buy Or Sell Your Car",
            color = Color.Black,
            fontFamily = FontFamily.Default,
            fontSize = 25.sp)
        Text(text = "In Kenya",
            color = Color.Black,
            fontFamily = FontFamily.Default,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(ROUTE_ADD_CAR)
        },colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier
                .size(width = 250.dp, height = 45.dp)) {
            Text(text = "Vehicles In Kenya",
                fontSize = 20.sp,
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate(ROUTE_VIEW_CAR)
        },colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier
                .size(width = 250.dp, height = 45.dp))
             {
            Text(text = "Sell Your Car",
                fontSize = 20.sp,
                color = Color.White)
        }


    }
}

@Preview
@Composable
private fun homeprev() {
    HomeScreen(rememberNavController())

}