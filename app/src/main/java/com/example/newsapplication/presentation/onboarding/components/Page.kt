package com.example.newsapplication.presentation.onboarding.components

import androidx.annotation.DrawableRes
import com.example.newsapplication.R
data class Page(
    val title : String ,
    val description : String,
    @DrawableRes val image : Int
)

val pages = listOf(Page("DSAFOHSDFAJKL" , "sfdakhbfnasdfoajl" , image = R.drawable.onboarding1),
    Page("DSAFOHSDFAJKL" , "sfdakhbfnasdfoajl" , image = R.drawable.onboarding2),
    Page("DSAFOHSDFAJKL" , "sfdakhbfnasdfoajl" , image = R.drawable.onboarding3))
