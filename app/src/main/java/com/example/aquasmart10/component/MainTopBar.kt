package com.example.aquasmart10.component

import com.example.aquasmart10.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

val poppinsFamily = FontFamily(
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_bold, FontWeight.Bold)

)

@Composable
fun MainTopBar(modifier: Modifier = Modifier) {

        Column(
                modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFF5E7BF9))
                        .padding(20.dp)
        ) {
                Row(
                        modifier = Modifier
                                .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                ) {
                        Image(
                                painter = painterResource(R.drawable.img_1),
                                contentDescription = "logo AquaSmart",
                                modifier = Modifier
                                        .size(70.dp)
                        )
                        Icon(
                                modifier = Modifier
                                        .padding(top = 15.dp)
                                        .size(32.dp),
                                imageVector = Icons.Default.Notifications,
                                tint = Color.White,
                                contentDescription = "Notifikasi"
                        )
                }
                Text(
                        text = "Selamat Datang,",
                        fontSize = 24.sp,
                        color = Color.White,
                        fontFamily = poppinsFamily,

                        modifier = Modifier
                                .padding(top = 10.dp),
                )
                Text(
                        text = "Budi",
                        fontSize = 32.sp,
                        color = Color.White,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                                .padding(top = 5.dp),
                )


        }
}

@Preview
@Composable
private fun MainTopBarPreview() {
        MainTopBar()
}