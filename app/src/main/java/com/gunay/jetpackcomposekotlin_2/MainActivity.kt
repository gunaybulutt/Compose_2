package com.gunay.jetpackcomposekotlin_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunay.jetpackcomposekotlin_2.ui.theme.JetpackComposeKotlin_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //OtherScreen()
            MainScreen()

        }
    }
}


@Composable
fun MainScreen(){
    //proTextField'ı stateless yapmak için yani her yeni birden çok proTextField oluşturulduğunuda aynı adla (myString)
    // içinde değişken oluşturulduğunda oluşabilecek karışıklıkları önlemek için mutable değişken bu şekilde başa tanımlanır.
    var myString = remember { mutableStateOf("") }


    Surface(color = Color.LightGray) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            proText(string = "Hello")
            Spacer(modifier = Modifier.padding(7.dp))
            proText(string = "Android")
            Spacer(modifier = Modifier.padding(7.dp))
            proTextField(myString.value){
                myString.value = it
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun proTextField(string: String, funtion: (String) -> Unit ){
    TextField(value = string, onValueChange = funtion)
    }



@Composable
fun proText(string: String ){
    Text(text = string, fontSize = 30.sp, fontStyle = FontStyle.Italic, fontFamily = FontFamily.SansSerif)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeKotlin_2Theme {
        //OtherScreen()
        MainScreen()
    }
}