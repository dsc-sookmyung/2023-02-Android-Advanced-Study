package com.gdsc.week02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

class EighthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = viewModel<MainViewModel>()
            Column(
                modifier=Modifier.fillMaxSize(),
                verticalArrangement= Arrangement.Center,
                horizontalAlignment= Alignment.CenterHorizontally,
            ){
                Text(
                    viewModel.data.value,
                    fontSize=30.sp,
                )
                Button(onClick={
                    viewModel.changeValue()
                }){
                    Text("변경")
                }
            }
        }
    }
}


class MainViewModel: ViewModel(){
    private val _data = mutableStateOf("Hello")
    val data:State<String> = _data

    fun changeValue(){
        _data.value="world"
    }
}
