package co.edu.sena.login2902081.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.login2902081.R
import co.edu.sena.login2902081.components.ButtonComponent
import co.edu.sena.login2902081.navigation.PostOfficeAppRouter
import co.edu.sena.login2902081.navigation.Screen
import co.edu.sena.login2902081.components.CheckboxComponent
import co.edu.sena.login2902081.components.ClickableLoginTextComponent
import co.edu.sena.login2902081.components.DividerTextComponent
import co.edu.sena.login2902081.components.HeadingTextComponents
import co.edu.sena.login2902081.components.MyTextFieldComponent
import co.edu.sena.login2902081.components.NormalTextComponents
import co.edu.sena.login2902081.components.PasswordTextFieldComponent

@Composable
fun SignUpScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponents(value = stringResource(id = R.string.hello))
            HeadingTextComponents(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.email)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.password)
            )
            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTexSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen) })

            Spacer (modifier = Modifier.height(80.dp))

            ButtonComponent(value = stringResource(id = R.string.register) )
            
            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(onTexSelected = {

            })
        }



    }

}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}