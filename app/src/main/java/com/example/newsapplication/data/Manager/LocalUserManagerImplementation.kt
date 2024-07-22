package com.example.newsapplication.data.Manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.preferencesOf
import androidx.datastore.preferences.preferencesDataStore
import com.example.newsapplication.domain.manager.LocalUserManager
import com.example.newsapplication.util.Constants
import com.example.newsapplication.util.Constants.APP_ENTRY
import com.example.newsapplication.util.Constants.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalUserManagerImplementation(private val context:Context)
    :LocalUserManager{
    override suspend fun saveAppEntry() {
        context.datastore.edit { settings->
            settings[PreferencesKeys.APP_ENTRY] = true
        }
        TODO("Not yet implemented")
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.datastore.data.map { preferences ->
            preferences[PreferencesKeys.APP_ENTRY]?:false

        }
        TODO("Not yet implemented")
    }


}


private val Context.datastore:  DataStore<Preferences> by preferencesDataStore(name =USER_SETTINGS )


private object PreferencesKeys{
    val APP_ENTRY = booleanPreferencesKey(name = Constants.APP_ENTRY)
}