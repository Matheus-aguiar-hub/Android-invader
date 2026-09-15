package com.example.android_invaders

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_invaders.ui.theme.AndroidInvadersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidInvadersTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    BasicComponentsScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicComponentsScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier
        .fillMaxSize()
        .background(Color(0, 0, 0, 255))
    ){
        Row(verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "Score: 0050",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF),
                fontFamily = FontFamily.Serif
            )

            Spacer(
                modifier = Modifier.weight(1f)
            )

            Text(
                text = "Lives: ",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color(0xFFFFFFFF),
                fontFamily = FontFamily.Serif,
                modifier = Modifier
            )

            AndroidEnemy(
                modifier = Modifier.size(50.dp)
                    .padding(2.dp),
                color = Color.Green
            )

            AndroidEnemy(
                modifier = Modifier.size(50.dp)
                    .padding(2.dp),
                color = Color.Green
            )

            AndroidEnemy(
                modifier = Modifier.size(50.dp)
                    .padding(2.dp),
                color = Color.Green
            )

            }
        Column {
            Row {
                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color(124, 248, 110, 255)
                )

                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color.Red
                )

                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color.Blue
                )

                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color.Yellow
                )

                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color.Green
                )
            }
        }
        Spacer(
            modifier = Modifier.weight(1f)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            StartLogo(
                modifier = Modifier
                    .padding(bottom = 32.dp)
                    .size(100.dp)
            )

            Text(
                text = "PRESS START",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(bottom = 32.dp)
                    .background(Color(91, 91, 91, 255))
                    .fillMaxWidth()
                    .padding(12.dp)
            )
        }
    }
}

@Composable
fun AndroidEnemy(
    color: Color,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.ic_launcher_foreground),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Android Enemy"
    )
}

@Composable
fun StartLogo(
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.icone_sem_background),
        contentDescription = "Nave espacial"
    )
}