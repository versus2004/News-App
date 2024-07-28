package com.example.newsapplication.presentation.onboarding.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.newsapplication.R

data class Page(
    @StringRes val title: Int, @StringRes val description: Int, @DrawableRes val image: Int
)

val pages = listOf(
    Page(R.string.page1title, R.string.page1desc, image = R.drawable.onboarding1),
    Page(R.string.page2title, R.string.page2desc, image = R.drawable.onboarding2),
    Page(R.string.page3title, R.string.page3desc, image = R.drawable.onboarding3)
)
