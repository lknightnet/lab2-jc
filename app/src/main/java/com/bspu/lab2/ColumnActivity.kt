package com.bspu.lab2

import android.content.res.Configuration
import android.os.Bundle
import android.text.TextUtils.split
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bspu.lab2.ui.theme.Lab2Theme

class ColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnMain()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ColumnMain() {
    val isPortrait = LocalConfiguration.current.orientation == Configuration.ORIENTATION_PORTRAIT

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Добро пожаловать в Column Layout.",
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            horizontalAlignment = if (isPortrait) Alignment.CenterHorizontally else Alignment.Start
        ) {
            repeat(10) {
                Text(
                    text = "Минеев лох",
                    modifier = Modifier
                        .padding(8.dp)
                        .background(getRandomColor())
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

fun getRandomColor(): Color {
    val colors = listOf(Color.Red, Color.Green, Color.Yellow, Color.Blue, Color.Cyan, Color.Magenta)
    return colors.random()
}