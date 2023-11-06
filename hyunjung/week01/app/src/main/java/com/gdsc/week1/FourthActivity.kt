package com.gdsc.week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class FourthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier=Modifier
                    .background(color=Color.Green)
                    .fillMaxWidth(),
                contentPadding=PaddingValues(16.dp),
                verticalArrangement=Arrangement.spacedBy(8.dp)
            ){
                item{
                    Text("Header")
                }
                items(50){index->
                    Text("글씨 $index")
                }
                item{
                    Text("Footer")
                }
            }
        }
    }
}

