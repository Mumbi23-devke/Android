package com.example.getting_started_with_jetpack_week1

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.getting_started_with_jetpack_week1.ui.theme.Getting_started_with_jetpack_week1Theme

class ScrollableListview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Scroll()
        }
    }
}


@Preview(showBackground = true)
@Composable

fun Scroll(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green)

    ) {
      LazyColumn{

//          items(500){
//              index ->
//              Text(text = "This is my content")
//              Image(painter = painterResource(id = R.drawable.eiffeltower)


          item {

              Column {
                  Text(text = "NEW CARRRRR !!!!!")
                  androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.cx5), contentDescription = null)
                  Text(text = "NEW CARRRRR !!!!!")
                  androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.cx5), contentDescription = null)
                  Text(text = "NEW CARRRRR !!!!!")
                  androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.cx5), contentDescription = null)
                  Text(text = "NEW CARRRRR!!!!!")
                  androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.cx5), contentDescription = null)

              }
          }

      }

    }

}
