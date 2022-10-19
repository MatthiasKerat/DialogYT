package com.kapps.dialogyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.kapps.dialogyt.ui.theme.DialogYTTheme
import com.kapps.dialogyt.ui.theme.orange

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        this.window.navigationBarColor = orange.toArgb()
        this.window.statusBarColor = orange.toArgb()

        super.onCreate(savedInstanceState)
        setContent {
            DialogYTTheme {
                MainScreen(viewModel)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DialogYTTheme {
        Greeting("Android")
    }
}