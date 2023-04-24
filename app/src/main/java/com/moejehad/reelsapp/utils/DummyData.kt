package com.moejehad.reelsapp.utils

import androidx.compose.runtime.mutableStateListOf
import com.moejehad.reelsapp.model.Reel

object DummyData {

    val reels = mutableStateListOf(
        Reel(
            id = 1,
            video = "1.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/4.png",
            userName = "Wafiya Hadeel",
            isLiked = true,
            likesCount = 778,
            commentsCount = 156,
            comment = "What an amazing view ..."
        ),
        Reel(
            id = 2,
            video = "2.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/7.png",
            userName = "Ibtisam Ban Shadid",
            isLiked = false,
            likesCount = 5923,
            commentsCount = 11,
            comment = "What an amazing view ..."
        ),
        Reel(
            id = 3,
            video = "3.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/3.png",
            userName = "Safiya Anjum",
            isLiked = true,
            likesCount = 2314,
            comment = "What an amazing view ...",
            commentsCount = 200
        ),
        Reel(
            id = 4,
            video = "4.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/6.png",
            userName = "Muhammad Ali",
            isLiked = false,
            likesCount = 786,
            comment = "What an amazing view ...",
            commentsCount = 700
        ),
        Reel(
            id = 5,
            video = "5.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/2.png",
            userName = "Ahmad khaled",
            isLiked = true,
            likesCount = 1890,
            comment = "What an amazing view ...",
            commentsCount = 232
        )

    )

}