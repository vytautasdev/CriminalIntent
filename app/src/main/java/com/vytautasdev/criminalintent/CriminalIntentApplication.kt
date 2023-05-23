package com.vytautasdev.criminalintent

import android.app.Application
import com.vytautasdev.criminalintent.database.CrimeRepository

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}