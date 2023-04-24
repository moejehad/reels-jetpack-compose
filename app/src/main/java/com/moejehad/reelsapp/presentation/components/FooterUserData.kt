package com.moejehad.reelsapp.presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.moejehad.reelsapp.model.Reel
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun FooterUserData(reel: Reel, modifier: Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            GlideImage(
                imageModel = { reel.userImage },
                modifier = Modifier
                    .size(28.dp)
                    .background(color = Color.Gray, shape = CircleShape)
                    .clip(CircleShape),
                imageOptions = ImageOptions(
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center
                )
            )

            Spacer(modifier = Modifier.width(18.dp))

            Text(
                text = reel.userName,
                color = Color.White,
                style = MaterialTheme.typography.h4,

            )

            Spacer(modifier = Modifier.width(10.dp))

            Canvas(modifier = Modifier.size(5.dp), onDraw = {
                drawCircle(
                    color = Color.White,
                    radius = 8f
                )
            })

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "Follow",
                color = Color.White,
                style = MaterialTheme.typography.h4
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = reel.comment,
            color = Color.White,
            style = MaterialTheme.typography.h4
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = reel.userName,
                color = Color.White,
                style = MaterialTheme.typography.h5
            )
            Spacer(modifier = Modifier.width(10.dp))

            Canvas(modifier = Modifier.size(5.dp), onDraw = {
                drawCircle(
                    color = Color.White,
                    radius = 8f
                )
            })
            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "Audio ABC",
                color = Color.White,
                style = MaterialTheme.typography.h5
            )
        }
    }
}


