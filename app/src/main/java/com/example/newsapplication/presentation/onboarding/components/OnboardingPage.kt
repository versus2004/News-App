package com.example.newsapplication.presentation.onboarding.components

import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import com.example.newsapplication.presentation.Dimens.mediumPadding1
import com.example.newsapplication.presentation.Dimens.mediumPadding2
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newsapplication.R
import com.example.newsapplication.presentation.onboarding.components.Page
import com.example.newsapplication.presentation.onboarding.components.pages
import com.example.newsapplication.ui.theme.NewsapplicationTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun onBoardingPage( modifier: Modifier, page:Page){


    Column(modifier) {
        Image(painter = painterResource(id = page.image), contentDescription = stringResource(page.description),
            Modifier
                .padding(mediumPadding1)
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f)
            , contentScale = ContentScale.Crop )
        Spacer(modifier = Modifier.height(mediumPadding1))
        Text(text = stringResource(page.title) , modifier = Modifier.padding(horizontal = mediumPadding2 ) , style =    MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold) , color = colorResource(
            id = R.color.display_small
        ))
        Text(text = stringResource(page.description) , modifier = Modifier.padding(horizontal = mediumPadding2 ) , style =    MaterialTheme.typography.bodyMedium    , color = colorResource(
            id = R.color.text_medium
        ))

    }
}
@Preview(showSystemUi = true , uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showSystemUi = true)
@Composable

fun prev(){
    NewsapplicationTheme {
        onBoardingPage(modifier = Modifier, page = pages[0])

    }
}