package com.qavan.issue4

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.FragmentActivity
import com.qavan.issue4.ui.theme.Issue4Theme

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Issue4Theme {
                // A surface container using the 'background' color from the theme
                Column(modifier = Modifier.fillMaxSize()) {
                    Button(onClick = {
                        TestDialog("Draggable dialog", R.style.Theme1).show(this@MainActivity.supportFragmentManager, "")
                    }) {
                        Text(text = "Show dialog with background as drawable(image)")
                    }
                    Button(onClick = {
                        TestDialog("Draggable dialog", R.style.Theme2).show(this@MainActivity.supportFragmentManager, null)
                    }) {
                        Text(text = "Show dialog with background as drawable(shape)")
                    }
                    Button(onClick = {
                        TestDialog("Draggable dialog", R.style.Theme3).show(this@MainActivity.supportFragmentManager, null)
                    }) {
                        Text(text ="Show dialog with background as color")
                    }
                }
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
    Issue4Theme {
        Greeting("Android")
    }
}