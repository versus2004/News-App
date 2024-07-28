package com.example.newsapplication.presentation.common

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.newsapplication.ui.theme.Black
import com.example.newsapplication.ui.theme.WhiteGray

@Composable
fun newsbutton(text:String , onCLick:()->Unit){
    Button(onClick = onCLick , colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary , contentColor = Color.White) , shape = RoundedCornerShape(size = 6.dp)) {
        Text(text = text, style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold) , color = Black)
    }

}

@Composable
fun newstextbutton(text:String , onCLick:()->Unit){
    TextButton(onClick = onCLick ) {
        Text(text =text, style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold) , color = WhiteGray)
    }

}
