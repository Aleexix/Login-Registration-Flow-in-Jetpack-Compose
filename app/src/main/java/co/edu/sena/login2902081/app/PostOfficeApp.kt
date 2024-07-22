package co.edu.sena.login2902081.app


import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import co.edu.sena.login2902081.navigation.PostOfficeAppRouter
import co.edu.sena.login2902081.navigation.Screen
import co.edu.sena.login2902081.screens.SignUpScreen
import co.edu.sena.login2902081.screens.TermsAndConditionsScreen

@Composable
fun PostOficceApp(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White

        ) {

        Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState ->
            when(currentState.value){
                is Screen.SignUpScreen ->{
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }
            }
            
        }

    }
}