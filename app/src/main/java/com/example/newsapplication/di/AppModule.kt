package com.example.newsapplication.di

import android.app.Application
import com.example.newsapplication.data.Manager.LocalUserManagerImplementation
import com.example.newsapplication.domain.manager.LocalUserManager
import com.example.newsapplication.domain.usecases.AppEntryUsecases
import com.example.newsapplication.domain.usecases.ReadAppEntry
import com.example.newsapplication.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
fun providelocalusermanager(
    application: Application
): LocalUserManager = LocalUserManagerImplementation(application)





    @Provides
    @Singleton
    fun provideAppentryusecases(localUserManager: LocalUserManager)=  AppEntryUsecases(readAppEntry = ReadAppEntry(localUserManager) ,
        saveAppEntry = SaveAppEntry(localUserManager))
}