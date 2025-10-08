package com.example.projectuts_kartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.projectuts_kartunama.ui.theme.ProjectUts_KartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectUts_KartuNamaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
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
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HeaderPlaceholder()

        Spacer(modifier = Modifier.height(32.dp))

        ContactPlaceholder()
    }
}

@Composable
fun HeaderPlaceholder() {
    // Bagian atas — nanti diisi logo, nama, jabatan
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(androidx.compose.foundation.shape.CircleShape)
                .padding(8.dp)
        ) // Placeholder foto

        Box(
            modifier = Modifier
                .height(24.dp)
                .width(120.dp)
        ) // Placeholder nama

        Box(
            modifier = Modifier
                .height(16.dp)
                .width(180.dp)
        ) // Placeholder jabatan
    }
}

@Composable
fun ContactPlaceholder() {
    // Bagian bawah — nanti diisi info kontak
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Box(modifier = Modifier.height(16.dp).width(220.dp)) // Email
        Box(modifier = Modifier.height(16.dp).width(160.dp)) // Telepon
        Box(modifier = Modifier.height(16.dp).width(200.dp)) // Alamat
    }
}
