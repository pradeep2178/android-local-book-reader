package com.pradeep2178.localbookreader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pradeep2178.localbookreader.ui.theme.LocalBookReaderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocalBookReaderTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BookLibraryScreen()
                }
            }
        }
    }
}

@Composable
fun BookLibraryScreen() {
    BookLibraryContent()
}
