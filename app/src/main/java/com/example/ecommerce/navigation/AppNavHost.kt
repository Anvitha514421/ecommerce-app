package com.example.ecommerce.navigation // ktlint-disable package-name

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ecommerce.navigation.Cart
import com.example.ecommerce.navigation.Favorite
import com.example.ecommerce.navigation.Home
import com.example.ecommerce.navigation.Payment
import com.example.ecommerce.navigation.ProductDetail
import com.example.ecommerce.navigation.Profile
import com.example.ecommerce.navigation.SignIn
import com.example.ecommerce.navigation.SignUp
import com.example.ecommerce.navigation.Splash
import com.example.ecommerce.ui.screens.auth.SignInRoute
import com.example.ecommerce.ui.screens.auth.SignUpRoute
import com.example.ecommerce.ui.screens.cart.CartRoute
import com.example.ecommerce.ui.screens.detail.DetailRoute
import com.example.ecommerce.ui.screens.favorite.FavoriteRoute
import com.example.ecommerce.ui.screens.home.HomeRoute
import com.example.ecommerce.ui.screens.payment.PaymentRoute
import com.example.ecommerce.ui.screens.profile.ProfileRoute
import com.example.ecommerce.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    onBadgeCountChange: (Int) -> Unit
) {
    NavHost(navController = navController, startDestination = Splash.route, modifier = modifier) {
        composable(Splash.route) {
            SplashScreen(
                navigateToHomeScreen = {
                    navController.navigate(SignIn.route)
                },
            )
        }

        composable(Home.route) {
            HomeRoute(
                onProductClicked = {
                    val route = "${ProductDetail.route}/${it.id}"
                    navController.navigate(route = route)
                },
            )
        }
        composable(ProductDetail.routeWithArgs, arguments = ProductDetail.arguments) {
            DetailRoute(
                onBadgeCountChange = onBadgeCountChange,
            )
        }
        composable(Cart.route) {
            CartRoute(
                onClickedBuyNowButton = {
                    navController.navigate(Payment.route)
                },
                onCartClicked = {
                    val route = "${ProductDetail.route}/${it.productId}"
                    navController.navigate(route = route)
                },
                onBadgeCountChange = onBadgeCountChange,
            )
        }
        composable(Profile.route) {
            ProfileRoute(
                logout = {
                    navController.navigate(SignIn.route) {
                        popUpTo(SignIn.route) {
                            inclusive = true
                        }
                    }
                },
            )
        }
        composable(SignIn.route) {
            SignInRoute(
                onGoSignUpButtonClicked = {
                    navController.navigate(SignUp.route)
                },
                navigateToHomeScreen = {
                    navController.navigate(Home.route)
                },
            )
        }
        composable(SignUp.route) {
            SignUpRoute(
                navigateToSignInScreen = {
                    navController.navigate(SignIn.route)
                },
            )
        }
        composable(Favorite.route) {
            FavoriteRoute(
                onProductClicked = {
                    val route = "${ProductDetail.route}/${it.productId}"
                    navController.navigate(route = route)
                },
            )
        }
        composable(Payment.route) {
            PaymentRoute()
        }
    }
}
