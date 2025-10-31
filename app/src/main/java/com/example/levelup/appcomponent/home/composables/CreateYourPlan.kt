package com.example.levelup.appcomponent.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.levelup.R
import org.w3c.dom.Text


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