package com.moejehad.reelsapp.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.moejehad.reelsapp.ui.theme.blackColor
import com.moejehad.reelsapp.ui.theme.greyColor
import com.moejehad.reelsapp.ui.theme.whiteColor

@Composable
fun AppTopBar(
    title: String,
) {
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        backgroundColor = whiteColor,
        elevation = 0.dp,
        title = {
            Text(
                text = title,
                color = blackColor,
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.h3,
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = com.moejehad.reelsapp.R.drawable.ic_camera),
                    contentDescription = null,
                    tint = blackColor,
                    modifier = Modifier.size(21.dp)
                )
            }

        }
    )
}