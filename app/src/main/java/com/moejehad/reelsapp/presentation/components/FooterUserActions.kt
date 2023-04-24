package com.moejehad.reelsapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.moejehad.reelsapp.R
import com.moejehad.reelsapp.model.Reel
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun FooterUserActions(reel: Reel, modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(end = 12.dp)
    ) {

        UserActionWithText(
            drawableRes = if (reel.isLiked) R.drawable.ic_favorite_fill else R.drawable.ic_favorite ,
            text = reel.likesCount.toString(),
            iconColor = if (reel.isLiked) Color.Red else Color.White
        )

        Spacer(modifier = Modifier.height(20.dp))

        UserActionWithText(
            drawableRes = R.drawable.ic_comment,
            text = reel.commentsCount.toString(),
            iconColor = Color.White
        )

        Spacer(modifier = Modifier.height(20.dp))

        UserAction(drawableRes = R.drawable.ic_send)

        Spacer(modifier = Modifier.height(28.dp))

        UserAction(drawableRes = R.drawable.ic_more_vert)

        Spacer(modifier = Modifier.height(28.dp))

        GlideImage(
            imageModel = { reel.userImage },
            modifier = Modifier
                .size(35.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp)),
            imageOptions = ImageOptions(
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            )
        )
    }
}