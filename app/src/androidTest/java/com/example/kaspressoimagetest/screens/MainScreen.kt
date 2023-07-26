package com.example.kaspressoimagetest.screens

import com.example.kaspressoimagetest.MainActivity
import com.example.kaspressoimagetest.R
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView

object MainScreen: KScreen<MainScreen>() {
    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java

    val goodImage = KImageView { withId(R.id.good_image) }
    val badImage = KImageView { withId(R.id.bad_image) }
}