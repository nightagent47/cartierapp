package com.apk.cartier.ui.theme.screens.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.cartier.ui.theme.data.AuthViewModel
import com.apk.cartier.ui.theme.navigation.ROUTE_LOGIN

@Composable
fun Registration(navController: NavHostController) {
    var username by  remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        Text(text = "Registration",
            color = Color.White,
            fontFamily = FontFamily.Default,
            fontSize = 34.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Create New Account",
            color = Color.White,
            fontFamily = FontFamily.Serif,
            fontSize = 20.sp
        )
        OutlinedTextField(
            value = username,
            onValueChange ={username=it},
            leadingIcon = { Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Email"
            ) },
            shape = RoundedCornerShape(25.dp),
            label = {
                Text(text="Enter username",
                    color = Color.White,
                    fontFamily = FontFamily.Default,
                    fontSize = 21.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange ={email=it},
            leadingIcon = { Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Password"
            ) },
            shape = RoundedCornerShape(25.dp),
            label = {
                Text(text="Enter email",
                    color = Color.White,
                    fontFamily = FontFamily.Default,
                    fontSize = 16.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange ={password=it},
            leadingIcon = { Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Password"
            ) },
            shape = RoundedCornerShape(25.dp),
            label = {
                Text(text="Enter password",
                    color = Color.White,
                    fontFamily = FontFamily.Default,
                    fontSize = 16.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange ={password=it},
            leadingIcon = { Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Password"
            ) },
            shape = RoundedCornerShape(25.dp),
            label = {
                Text(text="Confirm password",
                    color = Color.White,
                    fontFamily = FontFamily.Default,
                    fontSize = 16.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp)
        )
        Button(onClick = {
           // val myregister= AuthViewModel(navController,context)
            //myregister.signup(email.text.trim(),pass.text.trim(),confirmpass.text.trim())



        },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            modifier = Modifier
                .size(width = 250.dp, height = 35.dp)) {
            Text(text = "Create Account",
                color = Color.Black,
                fontSize = 15.sp) }
        Spacer(modifier = Modifier.height(20.dp))
        val isChecked = remember { mutableStateOf(false) }
        Row(horizontalArrangement = Arrangement.Center,
        ){
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {isChecked.value = it},
                enabled = true,
                colors = CheckboxDefaults.colors(),
                modifier = Modifier
                    .padding(5.dp)
                    .size(3.dp)
            )
            Spacer(modifier = Modifier.padding(2.dp))
            Text(text = "I agree to the Terms & Conditions.",
                modifier = Modifier.width(190.dp),
                textAlign = TextAlign.Center,
                fontSize = 11.sp,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        TextButton(onClick = { navController.navigate(ROUTE_LOGIN)},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Unspecified),
            modifier = Modifier.size(width = 250.dp, height = 35.dp)
        ) {
            Text(text = "Already a user? Login",
                color = Color.White,
                fontSize = 15.sp)

        }
    }

}

@Preview
@Composable
private fun Registrationprev() {
    Registration(rememberNavController())

}