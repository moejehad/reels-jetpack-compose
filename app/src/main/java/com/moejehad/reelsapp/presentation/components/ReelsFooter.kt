package com.moejehad.reelsapp.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moejehad.reelsapp.model.Reel

@Composable
fun ReelsFooter(reel: Reel) {
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
            modifier = Modifier.weight(8f)
        )
    }
}