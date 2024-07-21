package co.edu.sena.login2902081.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import co.edu.sena.login2902081.components.HeadingTextComponents
import co.edu.sena.login2902081.components.MyTextFieldComponent
import co.edu.sena.login2902081.components.NormalTextComponents

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
            MyTextFieldComponent(labelValue = stringResource(id = R.string.first_name))
        }

    }

}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}