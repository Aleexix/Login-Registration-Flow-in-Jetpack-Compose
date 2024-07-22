package co.edu.sena.login2902081.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.login2902081.R
import co.edu.sena.login2902081.app.PostOficceApp
import co.edu.sena.login2902081.components.HeadingTextComponents
import co.edu.sena.login2902081.navigation.PostOfficeAppRouter
import co.edu.sena.login2902081.navigation.Screen
import co.edu.sena.login2902081.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionsScreen(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)) {


        HeadingTextComponents(value = stringResource(id = R.string.terms_and_conditions_header))

    }

    SystemBackButtonHandler{
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }

}

@Preview
@Composable
fun TermsAndConditionsScreenPreview(){
    TermsAndConditionsScreen()
}