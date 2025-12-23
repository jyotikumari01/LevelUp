package com.example.levelup

import android.app.Application
import com.example.levelup.data.HealthConnectManager

class BaseApplication : Application() {
    val healthConnectManager by lazy {
        HealthConnectManager(this)
    }
}