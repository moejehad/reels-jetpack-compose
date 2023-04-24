package com.moejehad.reelsapp.presentation.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moejehad.reelsapp.utils.Screen
import com.moejehad.reelsapp.ui.theme.blackColor
import com.moejehad.reelsapp.ui.theme.whiteColor

@Composable
fun AppBottomNavigation() {

    val screens = listOf(Screen.Home, Screen.Search, Screen.Create, Screen.Reels, Screen.Profile)

    BottomNavigation(
        backgroundColor = whiteColor,
        elevation = 20.dp,
        modifier = Modifier.height(70.dp),
    ) {

        screens.forEach { screen ->
            BottomNavigationItem(
                modifier = Modifier.padding(vertical = 20.dp),
                icon = {
                    Icon(
                        painter = painterResource(id = screen.icon),
                        contentDescription = screen.title,
                        tint = blackColor,
                        modifier = Modifier.size(22.dp)
                    )
                },
                selected = false,
                onClick = {}
            )
        }

    }

}