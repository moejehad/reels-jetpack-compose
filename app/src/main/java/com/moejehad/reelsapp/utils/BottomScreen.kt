package com.moejehad.reelsapp.utils

import com.moejehad.reelsapp.R

sealed class Screen(
    val title: String,
    val icon: Int
) {

    object Home : Screen("Home", R.drawable.ic_home)
    object Search : Screen("Search", R.drawable.ic_search)
    object Create : Screen("Create", R.drawable.ic_plus)
    object Reels : Screen("Reels", R.drawable.ic_instagram_reels)
    object Profile : Screen("Profile", R.drawable.ic_home)

}
