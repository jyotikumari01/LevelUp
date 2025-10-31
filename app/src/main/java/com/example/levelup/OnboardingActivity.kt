package com.example.levelup

import androidx.activity.ComponentActivity
import androidx.health.connect.client.HealthConnectFeatures

class OnboardingActivity: ComponentActivity() {

    fun checkFeatureAvailability(){
        val healthConnectClient = Health
        if (healthConnectClient
                .features
                .getFeatureStatus(
                    HealthConnectFeatures.FEATURE_READ_HEALTH_DATA_IN_BACKGROUND
                ) == HealthConnectFeatures.FEATURE_STATUS_AVAILABLE) {

            // Feature is available
        } else {
            // Feature is not available
        }
    }
}