package com.apk.cartier.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apk.cartier.R
import com.apk.cartier.ui.theme.data.AuthViewModel
import com.apk.cartier.ui.theme.navigation.ROUTE_REGISTER

@Composable
fun Login(navController: NavController) {
    var email by  remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        Box {
            Image(painter = painterResource(id = R.drawable.kai), contentDescription = "")
        }
        Text(text = "Welcome Back",
            color = Color.White,
            fontFamily = FontFamily.Default,
            fontSize = 34.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Login to your Account",
            color = Color.White,
            fontFamily = FontFamily.Default,
            fontSize = 20.sp
        )
        OutlinedTextField(
            value = email,
            onValueChange ={email=it},
            leadingIcon = { Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email"
            ) },
            shape = RoundedCornerShape(25.dp),
            label = {
                Text(text="Enter email",
                color = Color.White,
                fontFamily = FontFamily.Default,
                fontSize = 21.sp
            )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedLeadingIconColor = Color.White,
                unfocusedBorderColor = Color.White
            )
        )
        OutlinedTextField(
            value = password,
            onValueChange ={password=it},
            leadingIcon = { Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Password"
            ) },
            label = {
                Text(text="Enter password",
                color = Color.White,
                fontFamily = FontFamily.Default,
                fontSize = 16.sp
            )
            },
            shape = RoundedCornerShape(25.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedLeadingIconColor = Color.White,
                unfocusedBorderColor = Color.White
            )
        )
        Button(onClick = {
            val mylogin= AuthViewModel(navController, context )
            mylogin.login(email.text.trim(),pass.text.trim())
        },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            modifier = Modifier
                .size(width = 250.dp, height = 35.dp)) {
            Text(text = "Login",
                color = Color.Black,
                fontSize = 15.sp) }
        Spacer(modifier = Modifier.height(30.dp))
        TextButton(onClick = { navController.navigate(ROUTE_REGISTER)},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Unspecified),
            modifier = Modifier.size(width = 250.dp, height = 35.dp)
        ) {
            Text(text = "Don't have an account? Sign up",
                color = Color.White,
                fontSize = 15.sp)

        }




    }

}

@Preview
@Composable
private fun Loginprev() {
    Login(rememberNavController())

}