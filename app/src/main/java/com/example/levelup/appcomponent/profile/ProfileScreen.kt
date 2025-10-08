package com.example.levelup.appcomponent.profile

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.levelup.R

@Preview
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier.background(colorResource(R.color.pink_shade_EDCAD5))
        ) {
            Spacer(modifier = Modifier.height(50.dp))

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.outline_face_24),
                    contentDescription = "Profile Photo",
                    modifier = Modifier
                        .size(50.dp)
                        .background(
                            colorResource(
                                R.color.black
                            ), RoundedCornerShape(20.dp)
                        )
                )

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = "Jyoti Singh",
                    fontSize = 16.sp,
                    color = colorResource(R.color.black),
                )
            }

            Spacer(modifier = Modifier.height(50.dp))
        }

        Spacer(modifier = Modifier.height(50.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = painterResource(R.drawable.outline_person_24),
                contentDescription = "Personal Info",
                modifier = Modifier.size(20.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "Personal Information",
                fontSize = 12.sp,
                color = colorResource(R.color.black),
                modifier = Modifier.weight(1f)
            )

            Icon(
                painter = painterResource(R.drawable.outline_arrow_back_ios_24),
                contentDescription = "Personal Info",
                modifier = Modifier
                    .size(15.dp)
                    .rotate(180f),
                tint = colorResource(R.color.gray_shade_BCB7B7)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.outline_notifications_active_24),
                contentDescription = "Personal Info",
                modifier = Modifier.size(20.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "Notification",
                fontSize = 12.sp,
                color = colorResource(R.color.black),
                modifier = Modifier.weight(1f)
            )

            Icon(
                painter = painterResource(R.drawable.outline_arrow_back_ios_24),
                contentDescription = "Personal Info",
                modifier = Modifier
                    .size(15.dp)
                    .rotate(180f),
                tint = colorResource(R.color.gray_shade_BCB7B7)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.outline_info_24),
                contentDescription = "Personal Info",
                modifier = Modifier.size(20.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "About",
                fontSize = 12.sp,
                color = colorResource(R.color.black),
                modifier = Modifier.weight(1f)
            )

            Icon(
                painter = painterResource(R.drawable.outline_arrow_back_ios_24),
                contentDescription = "Personal Info",
                modifier = Modifier
                    .size(15.dp)
                    .rotate(180f),
                tint = colorResource(R.color.gray_shade_BCB7B7)
            )
        }
    }
}