package com.gdsc.week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gdsc.week1.ui.theme.Week1Theme

class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier=Modifier
                    .fillMaxSize()
                    .background(color= Color.Yellow)
                    .padding(16.dp),
                horizontalAlignment= Alignment.CenterHorizontally,
            ){
                Text("Hello")
                Text("world")
            }
        }
    }
}

