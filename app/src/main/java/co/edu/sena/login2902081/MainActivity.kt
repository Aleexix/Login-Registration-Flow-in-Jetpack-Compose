package co.edu.sena.login2902081


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.login2902081.app.PostOficceApp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PostOficceApp()
        }
    }
}

@Preview
@Composable
fun DefaultPreview(){
    PostOficceApp()
}