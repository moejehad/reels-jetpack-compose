package com.moejehad.reelsapp.presentation.reels

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.moejehad.reelsapp.helpers.Constants.videoList

@Composable
fun ReelsScreen() {
    Box(Modifier.background(color = Color.Black)) {
        ReelsList()
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ReelsList() {

    val pager = rememberPagerState()
    val reels = videoList

    VerticalPager(
        pageCount = reels.size,
        state = pager,
        modifier = Modifier.fillMaxSize(),
    ) { index ->
        Box(modifier = Modifier.fillMaxSize()) {
            VideoPlayer(link = reels[index])
            Column(Modifier.align(Alignment.BottomStart)) {
                ReelsFooter(reels[index])
                Divider()
            }
        }
    }

}

@Composable
fun ReelsFooter(reel: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 18.dp, bottom = 18.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        FooterUserData(
            reel = reel,
            modifier = Modifier.weight(8f)
        )

        FooterUserActions(
            reel = reel,
            modifier = Modifier.weight(28f)
        )
    }
}


@Composable
fun FooterUserData(reel: String, modifier: Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = "https://avatars.githubusercontent.com/u/28947735?v=4",
                contentDescription = "mohammed",
                modifier = Modifier
                    .size(28.dp)
                    .background(color = Color.Gray, shape = CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(18.dp))

            Text(
                text = "Moe Jehad",
                color = Color.White,
                style = MaterialTheme.typography.subtitle2
            )

            Spacer(modifier = Modifier.width(18.dp))

            Canvas(modifier = Modifier.size(5.dp), onDraw = {
                drawCircle(
                    color = Color.White,
                    radius = 8f
                )
            })

            Spacer(modifier = Modifier.width(18.dp))

            Text(
                text = "Follow",
                color = Color.White,
                style = MaterialTheme.typography.subtitle2
            )
        }

        Spacer(modifier = Modifier.height(18.dp))

        Text(
            text = "What an amazing view ...",
            color = Color.White
        )

        Spacer(modifier = Modifier.height(18.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Moe Jehad",
                color = Color.White
            )
            Spacer(modifier = Modifier.width(18.dp))

            Canvas(modifier = Modifier.size(5.dp), onDraw = {
                drawCircle(
                    color = Color.White,
                    radius = 8f
                )
            })
            Spacer(modifier = Modifier.width(18.dp))

            Text(
                text = "Audio ABC",
                color = Color.White
            )
        }
    }
}

@Composable
fun FooterUserActions(reel: String, modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(end = 12.dp)
    ) {
        UserActionWithText(
            drawableRes = com.moejehad.reelsapp.R.drawable.baseline_favorite_24,
            text = "Like"
        )

        Spacer(modifier = Modifier.height(28.dp))

        UserActionWithText(
            drawableRes = com.moejehad.reelsapp.R.drawable.baseline_mode_comment_24,
            text = "Comment"
        )

    }
}

@Composable
fun UserActionWithText(
    @DrawableRes drawableRes: Int,
    text: String
) {

    Icon(
        imageVector = ImageVector.vectorResource(id = drawableRes),
        tint = Color.White,
        modifier = Modifier.size(20.dp),
        contentDescription = null
    )
    
    Spacer(modifier = Modifier.height(6.dp))

    Text(
        text = text,
        color = Color.White,
        fontSize = 13.sp,
        fontWeight = FontWeight.SemiBold
    )
}
