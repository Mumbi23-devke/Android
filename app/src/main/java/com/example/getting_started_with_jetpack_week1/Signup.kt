package com.example.getting_started_with_jetpack_week1

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
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_with_jetpack_week1.ui.theme.Getting_started_with_jetpack_week1Theme

class Signup : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignUp()
        }
    }
}


@Preview(showBackground = true)

@Composable

fun SignUp(){

    val firstname by remember {
        mutableStateOf("")
    }


    val lastname by remember {
        mutableStateOf("")
    }

    val number by remember {
        mutableStateOf("")
    }

    val email by remember {
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
            .background(Color.Gray)
            .fillMaxSize()

    ) {

        Text(text = "Sign Up Here", color = Color.Green, fontSize = 20.sp)
        OutlinedTextField(value = firstname,
            onValueChange = firstname,
            label = { Text(text = "First name")},
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Green)

        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = lastname,
            onValueChange = lastname,
            label = { Text(text = "Last name")},
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Green)

        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = number,
            onValueChange = number,
            label = { Text(text = "Phone number")},
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Green)

        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = email,
            onValueChange = email,
            label = { Text(text = "Email address")},
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Green)

        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = password,
            onValueChange = password,
            label = { Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Green)

        )

        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { /*TODO*/ },

            modifier = Modifier.fillMaxWidth())
        {
            Text(text = "SUBMIT")
        }
    }

}