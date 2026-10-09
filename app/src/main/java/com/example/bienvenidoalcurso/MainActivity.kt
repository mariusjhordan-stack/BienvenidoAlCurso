package com.example.bienvenidoalcurso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFFD2E8D4) // Verde pastel de fondo
            ) {
                BusinessCard()
            }
        }
    }
}
@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.weight(1f))
        HeaderSection(
            name = "Jennifer Doe",
            title = "Android Developer Extraordinaire"
        )
        Spacer(modifier = Modifier.weight(1f))
        ContactSection(
            phone = "+11 (123) 444 555 666",
            social = "@AndroidDev",
            email = "jen.doe@android.com"
        )
    }
}

@Composable
fun HeaderSection(name: String, title: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color(0xFF073042)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(bottom = 12.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Android,
                    contentDescription = null,
                    tint = Color(0xFF3DDC84),
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "android",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Light,
                    letterSpacing = 2.sp
                )
            }
        }
        Text(
            text = name,
            fontSize = 40.sp,
            fontWeight = FontWeight.Light,
            color = Color.Black,
            modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
        )
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006D3B) // Verde oscuro de texto
        )
    }
}

@Composable
fun ContactSection(phone: String, social: String, email: String) {
    Column(
        modifier = Modifier.padding(bottom = 36.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        ContactRow(icon = Icons.Default.Phone, text = phone)
        ContactRow(icon = Icons.Default.Share, text = social)
        ContactRow(icon = Icons.Default.Email, text = email)
    }
}

@Composable
fun ContactRow(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF006D3B),
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text(
            text = text,
            fontSize = 14.sp,
            color = Color(0xFF191C19)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFD2E8D4)
    ) {
        BusinessCard()
    }
}