package com.moejehad.reelsapp.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserActionWithText(
    @DrawableRes drawableRes: Int,
    text: String,
    iconColor: Color
) {

    Icon(
        imageVector = ImageVector.vectorResource(id = drawableRes),
        tint = iconColor,
        modifier = Modifier.size(22.dp),
        contentDescription = null
    )

    Spacer(modifier = Modifier.height(6.dp))

    Text(
        text = text,
        color = Color.White,
        style = MaterialTheme.typography.h5
    )
}
