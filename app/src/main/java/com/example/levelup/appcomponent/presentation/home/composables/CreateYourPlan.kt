package com.example.levelup.appcomponent.presentation.home.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun CreateYourPlan() {

    CreateYourPlanContent()
}

@Composable
fun CreateYourPlanContent() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Create Your Plan"
            )
            Text(
                text = "Create"
            )
        }
    }
}