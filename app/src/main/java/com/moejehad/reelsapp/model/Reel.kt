package com.moejehad.reelsapp.model

import android.net.Uri

data class Reel(
    val id: Int,
    private val video: String,
    val userImage: String,
    val userName: String,
    var isLiked: Boolean = false,
    val likesCount: Int,
    val comment: String,
    val commentsCount: Int,
) {

    fun getVideoUrl(): Uri {
        return Uri.parse("asset:///${video}")
    }

}