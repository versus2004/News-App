package com.example.newsapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.example.newsapplication.domain.usecases.AppEntryUsecases
import com.example.newsapplication.ui.theme.NewsapplicationTheme
import com.example.newsapplication.presentation.onboarding.components.onBoardingScreen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject lateinit var appEntryUsecases: AppEntryUsecases


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)
        installSplashScreen()
        lifecycleScope.launch {
            appEntryUsecases.readAppEntry().collect(){
                Log.d("Test",it.toString())
            }
        }
          
        enableEdgeToEdge()
        setContent {
            NewsapplicationTheme {
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background).systemBarsPadding()) {
                    onBoardingScreen()
                }
            }
        }
    }
}

