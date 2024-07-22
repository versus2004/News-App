package com.example.newsapplication.domain.usecases

import com.example.newsapplication.domain.manager.LocalUserManager

class SaveAppEntry(private val localUserManager: LocalUserManager) {
    suspend operator fun invoke (){
        localUserManager.saveAppEntry()
    }
}