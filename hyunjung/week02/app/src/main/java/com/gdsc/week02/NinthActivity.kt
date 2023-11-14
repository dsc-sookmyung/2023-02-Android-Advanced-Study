package com.gdsc.week02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gdsc.week02.ui.theme.Week02Theme
import androidx.lifecycle.viewmodel.compose.viewModel

class NinthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun HomeScreen(viewModel: MainViewModel2 = viewModel()){
    //text1은 MutableState<String> 타입
    val text1= remember{
        mutableStateOf("Hello world")
    }

    //text2는 String 타입
    var text2 by remember{
        mutableStateOf("Hello World")
    }

    //text는 String 타입, setText는 (String)->Unit
    val (text,setText)=remember{
        mutableStateOf("Hello world")
    }

    //text3는 State<String> 타입
    val text3 = viewModel.liveData.observeAsState("Hello World")

    Column(){
        Text("Hello world")
        Button(onClick={
            //text1.value="변경"
            //text2="변경"
            //setText("변경")
        }){
            Text("클릭")
        }
        TextField(value = text, onValueChange = setText)
    }
}

class MainViewModel2: ViewModel(){
    private val _value=mutableStateOf("Hello World")
    val value: State<String> = _value

    private val _liveData=MutableLiveData<String>()
    val liveData:LiveData<String> =_liveData

    fun changeValue(value:String){
        _value.value=value
    }
}