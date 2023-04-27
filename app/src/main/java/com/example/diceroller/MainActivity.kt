package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diceroller.ui.theme.DiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                DiceRollerTheme {
                    Surface (
                        color = Color(190,190,190)
                            ) {
                        RollerApp()
                    }

                }
            }
        }
    }


@Preview
@Composable
fun RollerApp(){

    var result = 1

    Text(
        text = stringResource(R.string.titulo),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        fontSize = 35.sp,
        color = Color.Black,
        fontFamily = FontFamily.Default,
        textAlign = TextAlign.Center,



    )

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        Image(
            painter = painterResource(id = R.drawable.dice_1),
            contentDescription = "1"
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = {
            result = (1..6).random()
        }) {
            Text(stringResource(id = R.string.roll))
        }

    }

}