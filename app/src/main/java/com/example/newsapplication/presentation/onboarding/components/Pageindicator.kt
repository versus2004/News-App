package com.example.newsapplication.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.newsapplication.ui.theme.BlueGray
import com.example.newsapplication.presentation.Dimens.indicatorSize
@Composable
fun Pageindicator(
    modifier: Modifier = Modifier,
    pageSize : Int,
    selectedpage:Int,
    selectedColor : Color = MaterialTheme.colorScheme.primary,
    unselectedColor: Color = BlueGray

){

    Row(modifier=modifier.padding(5.dp) , horizontalArrangement = Arrangement.SpaceBetween) {
        repeat(pageSize){ page->
            Box(modifier = Modifier.size(indicatorSize).clip(CircleShape) .background(color = if(page==selectedpage)selectedColor else unselectedColor))

        }
    }

}
