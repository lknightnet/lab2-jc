package com.bspu.lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.bspu.lab2.ui.theme.component.CustomButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Main()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Main(){
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        CustomButton(
            context = context,
            activity = BoxActivity::class,
            text = "Box Layout"
        )
        CustomButton(
            context = context,
            activity = ColumnActivity::class,
            text = "Column Layout"
        )
        CustomButton(
            context = context,
            activity = RowActivity::class,
            text = "Row Layout"
        )
        CustomButton(
            context = context,
            activity = ViewActivity::class,
            text = "View Elements"
        )
        CustomButton(
            context = context,
            activity = ImageActivity::class,
            text = "Работа с изображениями"
        )
    }
}