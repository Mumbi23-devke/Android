@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.getting_started_with_jetpack_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)

@Composable

fun Login(){
    val username by remember {
        mutableStateOf("")
    }

    val password by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ,

        modifier = Modifier
            .background(color = Color.Red)
            .fillMaxSize()

    ) {

        Image(painter = painterResource(id = R.drawable.cx5),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .fillMaxSize()

        )


        Text(text = "Welcome to Android Studio. Login!!", color = Color.Black, fontSize = 30.sp)
        OutlinedTextField(value = username,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "Person")},
            onValueChange = {username},
            label = { Text(text = "Username")},

            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)

        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = password,
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Lock")},
            onValueChange = {password},
            label = { Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)

        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()


            ) {
            Text(text = "LOGIN")
        }

    }
}