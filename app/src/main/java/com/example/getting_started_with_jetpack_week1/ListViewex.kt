package com.example.getting_started_with_jetpack_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_with_jetpack_week1.ui.theme.Getting_started_with_jetpack_week1Theme
import java.time.format.TextStyle

class ListViewex : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             Mylist()
        }
    }
}

private val countrylist = mutableListOf("Kenya, Uganda, Tanzania, Ethiopia")
private val listmodifier = Modifier
    .fillMaxSize()
    .background(color = Color.Magenta)
    .padding(15.dp)

private val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 30.sp, color = Color.Yellow)


@Preview(showBackground = true)
@Composable

fun Mylist(){
    LazyColumn(modifier = listmodifier ){
        items(countrylist){
             country ->
            Text(text = country, style = textStyle)
        }
    }

}