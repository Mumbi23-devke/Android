package com.example.getting_started_with_jetpack_week1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainIntents : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_intents()
        }
    }
}

@Preview(showBackground = true)


@Composable

fun My_intents(){

    Column (

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ,
        modifier = Modifier
            .background(color = Color.Blue)
            .fillMaxSize()
            .padding(15.dp)


            ){

        Spacer (modifier = Modifier.height(20.dp))

        val sms = LocalContext.current

        Button(onClick = {

            val number = "0757641008"
            val message = "Where are you?"

            val uri = Uri.parse("smsto:$number")
            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("sms_body", message)
            sms.startActivity(intent)


        },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()

            ) {
                Text(text = "LAUNCH SMS")
        }

        Spacer(modifier = Modifier.height(20.dp))

            val pic = LocalContext.current

        Button(onClick = {

            val takepic = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            pic.startActivity(takepic)
                         },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()
        
            ) {
                Text(text = "LAUNCH CAMERA")
        }

        Spacer(modifier = Modifier.height(20.dp))

            val emaillaunch = LocalContext.current

        Button(onClick = {
            val email_intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:gloriawaweru5@gmail.com")
                putExtra(Intent.EXTRA_SUBJECT, "Subject")
                putExtra(Intent.EXTRA_TEXT, "Body")

        }
            val chooserintent = Intent.createChooser(email_intent, "Send Email...")
            emaillaunch.startActivity(chooserintent)

        },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()

            ) {
                Text(text = "LAUNCH EMAIL")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ },

            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()

            ) {
                    Text(text = "SHARE")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()

            ) {
                Text(text = "VIDEO CALL")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ },

            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()
            
            ) {
                Text(text = "VOICE CALL")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()

            )

        {
            Text(text = "SIM TOOLKIT")
        }
    }

}
