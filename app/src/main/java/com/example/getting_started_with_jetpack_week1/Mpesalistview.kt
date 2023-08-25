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

class Mpesalistview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Mpesa()

        }
    }
}

private val options = mutableListOf("Send Money," +
        "Withdraw Cash," +
        "Buy Airtime," +
        "Loans and Savings," +
        "Lipa na Mpesa," +
        "My Account," +
        "Pochi La Biashara," +
        "Mpesa Services")

private val modify = Modifier
    .fillMaxSize()
    .padding(10.dp)
    .background(color = Color.DarkGray)

private val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 30.sp, color = Color.Cyan)

@Preview(showBackground = true)

@Composable

fun Mpesa(){
    LazyColumn(modifier = modify){
        items(options){
            list ->
            Text(text = list, style = textStyle)
        }
    }
}
