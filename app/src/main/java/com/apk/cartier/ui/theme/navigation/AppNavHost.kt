package com.apk.cartier.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.apk.cartier.ui.theme.screens.home.HomeScreen
import com.apk.cartier.ui.theme.screens.login.Login
import com.apk.cartier.ui.theme.screens.registration.Registration


@Composable
fun AppNavHost(modifier: Modifier= Modifier, navController: NavHostController= rememberNavController(), startDestination: String= ROUTE_LOGIN) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            Login(navController)
        }
        composable(ROUTE_REGISTER) {
            Registration(navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
    }
}