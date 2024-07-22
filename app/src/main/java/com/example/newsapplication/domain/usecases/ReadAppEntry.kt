package com.example.newsapplication.domain.usecases

import com.example.newsapplication.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow


class ReadAppEntry(private val localUserManager: LocalUserManager) {
    suspend operator fun invoke () : Flow<Boolean> {
       return localUserManager.readAppEntry()
    }
}