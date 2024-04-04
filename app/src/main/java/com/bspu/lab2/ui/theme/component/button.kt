package com.bspu.lab2.ui.theme.component

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.bspu.lab2.BoxActivity
import kotlin.reflect.KClass

@Composable
fun CustomButton(context: Context, activity: KClass<out Activity>, text: String){
    Button(
        onClick = {context.startActivity(Intent(context, activity.java))}
    ) {
        Text(text = text)
    }
}