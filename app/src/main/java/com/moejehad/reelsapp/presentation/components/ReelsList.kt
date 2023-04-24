package com.moejehad.reelsapp.presentation.components

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.moejehad.reelsapp.R
import com.moejehad.reelsapp.presentation.reels.VideoPlayer
import com.moejehad.reelsapp.utils.DummyData

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ReelsList() {

    val pager = rememberPagerState()
    val reels = remember { DummyData.reels }
    val size by remember { mutableStateOf(100.dp) }
    var isLike by remember { mutableStateOf(false) }

    val animatedSize by animateDpAsState(
        targetValue = if (isLike) size else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioLowBouncy,
            stiffness = 500f
        )
    )

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (favIcon, reelsPager) = createRefs()

        VerticalPager(
            pageCount = reels.size,
            state = pager,
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(reelsPager) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
        ) { index ->
            Box(modifier = Modifier
                .fillMaxSize()
                .pointerInput(Unit) {
                    detectTapGestures(
                        onDoubleTap = {
                            isLike = true
                            reels[index] = reels[index].copy(isLiked = true)
                        },
                        onTap = {

                        }
                    )
                }) {
                VideoPlayer(uri = reels[index].getVideoUrl())
                Column(Modifier.align(Alignment.BottomStart)) {
                    ReelsFooter(reels[index])
                    Divider()
                }
            }
        }

        if (isLike) {
            Icon(
                painterResource(id = R.drawable.ic_favorite_fill),
                tint = Color.Red,
                modifier = Modifier
                    .size(animatedSize)
                    .constrainAs(favIcon) {
                        centerHorizontallyTo(reelsPager)
                        centerVerticallyTo(reelsPager)
                    },
                contentDescription = ""
            )
            if (animatedSize == size) {
                isLike = false
            }
        }

    }

}
