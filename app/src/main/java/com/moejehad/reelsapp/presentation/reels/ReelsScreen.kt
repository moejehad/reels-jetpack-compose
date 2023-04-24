package com.moejehad.reelsapp.presentation.reels

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.moejehad.reelsapp.presentation.components.AppBottomNavigation
import com.moejehad.reelsapp.presentation.components.AppTopBar
import com.moejehad.reelsapp.presentation.components.ReelsList
import com.moejehad.reelsapp.ui.theme.lightGreyColor

@Composable
fun ReelsScreen() {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { AppTopBar(title = "Reels") },
        bottomBar = { AppBottomNavigation() }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues = paddingValues)) {
            Box(
                Modifier
                    .background(color = lightGreyColor, shape = RoundedCornerShape(20.dp))
                    .padding(horizontal = 15.dp, vertical = 10.dp)
                    .clip(RoundedCornerShape(20.dp))
            ) {
                ReelsList()
            }
        }
    }

}

