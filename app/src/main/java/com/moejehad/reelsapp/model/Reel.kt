package com.moejehad.reelsapp.model

data class Reel(
    val id: Int,
    val video: String,
    val userImage: String,
    val userName: String,
    var isLiked: Boolean = false,
    val likesCount: Int,
    val comment: String,
    val commentsCount: Int,
)