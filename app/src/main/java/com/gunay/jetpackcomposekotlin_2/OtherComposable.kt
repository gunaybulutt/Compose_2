package com.gunay.jetpackcomposekotlin_2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherScreen() {
    Surface(color = Color.LightGray) {
        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            //MutableStateOF
            //mutableStateOf ---> değeri değişince composun tekrar oluşturulmasını sağlar (değiştirilebilir bir değer oluştur)
            // mutableStateOf ---> değer değiştirilince recomposition yapar yukarıdakinin kısa hali
            //mutableStateOf fonksiyonu, Android Jetpack Compose framework'ünde kullanılan bir fonksiyondur ve değiştirilebilir (mutable)
            // bir durumu temsil etmek için kullanılır. Bu fonksiyon, genellikle bir değişkenin değerini tutmak ve bu değerin güncellendiğinde
            // UI'ın yeniden çizilmesini sağlamak için kullanılır.


            // REMEMBER
            //remember fonksiyonu, Android Jetpack Compose framework'ünde kullanılan bir fonksiyondur ve genellikle Compose
            // UI'ları içinde durumu (state) tutmak için kullanılır. Bu fonksiyon, verinin değiştiği durumları hatırlayarak UI'nın güncellenmesini sağlar.
            //Örnek olarak, veri değiştiğinde ekranın tekrar çizilmesi gereken durumlarda kullanılabilir. Yukarıdaki örnekte, mutableStateOf fonksiyonu ile
            // oluşturulan bir mutable state (değiştirilebilir durum) içerir. Bu durumu remember fonksiyonu kullanarak hatırlar.
            // remember fonksiyonu, Compose tarafından sağlanan bir mekanizma ile, Compose UI'ları içinde durumu korumak için kullanılır.


            var myString = remember { mutableStateOf("Android Compose") }
            TextField(value = myString.value, onValueChange = {
                myString.value = it
                println(myString)
            })



            /*
            var myString = "Android Compose"
            TextField(value = TextFieldValue(text = myString), onValueChange = {
                myString = it.text
                println(myString)
            })

            Text(text = "Hello", fontSize = 18.sp)

            Spacer(modifier = Modifier.padding(7.dp))

            Button(onClick = {println("clicked")}) {
                Text(text = "Button")
                Text(text = "Test")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.mars), contentDescription = "mars")

            Spacer(modifier = Modifier.padding(7.dp))

            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground), contentDescription = null )

            Spacer(modifier = Modifier.padding(7.dp))

            Image(painter = ColorPainter(Color.Blue), contentDescription = null, modifier = Modifier.size(20.dp,20.dp))

             */
        }
    }

}