package com.bspu.lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class ViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewMain()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ViewMain(){
    val messageTemp = rememberSaveable { mutableStateOf("") }
    val messageFinal = rememberSaveable { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(messageFinal.value, fontSize = 28.sp)
        TextField(
            value = messageTemp.value,
            textStyle = TextStyle(fontSize=25.sp),
            onValueChange = {newText -> messageTemp.value = newText}
        )
        Button(onClick = {
            messageFinal.value = messageTemp.value
        }) {
            Text(text = "Save")
        }
    }
}