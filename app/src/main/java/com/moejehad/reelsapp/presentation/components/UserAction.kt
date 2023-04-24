package com.moejehad.reelsapp.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp

@Composable
fun UserAction(@DrawableRes drawableRes: Int) {
    Icon(
        imageVector = ImageVector.vectorResource(id = drawableRes),
        tint = Color.White,
        modifier = Modifier.size(20.dp),
        contentDescription = null
    )
}