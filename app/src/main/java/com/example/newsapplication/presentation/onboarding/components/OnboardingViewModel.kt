package com.example.newsapplication.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapplication.domain.usecases.AppEntryUsecases
import com.example.newsapplication.presentation.onboarding.components.OnboardingEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnboardingViewModel @Inject constructor( private val appEntryusecases: AppEntryUsecases) : ViewModel(){


    fun onevent(event : OnboardingEvent){
        when(event){
           is OnboardingEvent.saveappentry -> {
               saveAppEntry()
           }
        }

    }

    private fun saveAppEntry(){
        viewModelScope.launch {     appEntryusecases.saveAppEntry }
    }
}