package com.gdsc.week02

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.tooling.preview.Preview
import com.gdsc.week02.ui.theme.Week02Theme
import kotlinx.coroutines.launch

@OptIn(ExperimentalComposeUiApi::class)
class SixthActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //구조 분해 사용
            val (text,setValue)=remember{
                mutableStateOf("")
            }

            val scaffoldState = rememberScaffoldState()
            val scope=rememberCoroutineScope() //코루틴 스코프
            val keyboardController=LocalSoftwareKeyboardController.current

            Scaffold(
                scaffoldState = scaffoldState,
            ) {
                Column(
                    modifier=Modifier.fillMaxSize(),
                    verticalArrangement= Arrangement.Center,
                    horizontalAlignment= Alignment.CenterHorizontally,
                ){
                    TextField(
                        value=text,
                        onValueChange=setValue,
                    )
                    Button(onClick={
                        keyboardController?.hide() //키보드 숨기기
                        scope.launch{
                            scaffoldState.snackbarHostState.showSnackbar("Hello $text")
                        }
                    }){
                        Text("클릭")
                    }
                }
            }
        }
   }
}
