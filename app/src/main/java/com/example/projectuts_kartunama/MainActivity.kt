package com.example.projectuts_kartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import com.example.projectuts_kartunama.ui.theme.ProjectUts_KartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectUts_KartuNamaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray
                ) {
                    // Panggil layout utama
                    KartuNamaLayoutKosong()
                }
            }
        }
    }
}

@Composable
fun KartuNamaLayoutKosong() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Logo Android
        Image(
            painter = painterResource(id = R.drawable.androidd),
            contentDescription = "Logo Android",
            modifier = Modifier
                .size(180.dp)
                .padding(bottom = 5.dp)
                .clip(RoundedCornerShape(30.dp))
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Nama
        Text(
            text = "Gisela Febriana",
            fontFamily = FontFamily.Serif,
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = "Android Daveloper Extraordinaire",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Green,
            fontSize = 17.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(17.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, top = 4.dp, end = 24.dp),

        ) {
            Image(
                painter = painterResource(id = R.drawable.telepon),
                contentDescription = "telepon",
                modifier = Modifier
                    .size(45.dp)
                    .padding(end = 12.dp)
            )
            Text(
                text = "+62 821 6298 3537",
                fontSize = 15.sp,
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                modifier = Modifier.fillMaxWidth(),
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, top = 4.dp, end = 24.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.berbagi),
                contentDescription = "berbagi",
                modifier = Modifier
                    .size(45.dp)
                    .padding(end = 12.dp)
            )
            Text(
                text = "@giselafebriana",
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black

            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, top = 4.dp, end = 24.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_email),
                contentDescription = "android_email",
                modifier = Modifier
                    .size(45.dp)
                    .padding(end = 12.dp)
            )
            Text(
                text = "gisela.febriana@gmail.com",
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black

            )
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun KartuNamaLayoutKosongPreview() {
    ProjectUts_KartuNamaTheme {
        KartuNamaLayoutKosong()
    }
}
