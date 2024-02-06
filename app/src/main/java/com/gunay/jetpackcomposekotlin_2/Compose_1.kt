package com.gunay.jetpackcomposekotlin_2

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun mainScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        proText2(name = "Merhaba")
        Spacer(modifier = Modifier.padding(5.dp))  // boşluk koymak için kullanılıyor
        proText2(name = "Hello")
        Spacer(modifier = Modifier.padding(5.dp))
        proText2(name = "Kon-nichiwa")
        Spacer(modifier = Modifier.padding(5.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {

            proText2(name = "Test-1")
            //Spacer(modifier = Modifier.padding(5.dp))
            proText2(name = "Test-2")

        }
    }
}


@Composable
fun proText2(name : String){
    Text(modifier = Modifier
        .background(Color.Black)
        .width(150.dp)
        //.fillMaxWidth()
        .clickable {
            println("tiklandi")
        },
        text = name,
        color = Color.White,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center)
}