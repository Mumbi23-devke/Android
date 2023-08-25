package com.example.getting_started_with_jetpack_week1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_with_jetpack_week1.ui.theme.Getting_started_with_jetpack_week1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}
@Preview(showBackground = true)

@Composable

fun Home(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ,

        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize()  // covers entire page,ie, width and height


    ) {
        Text(text = "This is My App!!!", color = Color.Magenta, fontSize = 20.sp )
        Spacer(modifier = Modifier.height(15.dp))

        val login = LocalContext.current

        Button(onClick = { 
                         
            login.startActivity(Intent(login, Signup::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()

            ) {

            Text(text = "Login")
        }
        Spacer(modifier = Modifier.fillMaxWidth())

        val scroll = LocalContext.current

        Button(onClick = {

            scroll.startActivity(Intent(login, ScrollableListview::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()

        ) {

            Text(text = "Scroll")
        }
        Spacer(modifier = Modifier.fillMaxWidth())

}

}