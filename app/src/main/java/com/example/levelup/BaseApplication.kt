package com.example.levelup

import android.app.Application

class BaseApplication: Application() {
    val healthConnectManager by lazy {
        com.example.levelup.appcomponent.data.HealthConnectManager(this)
    }
}