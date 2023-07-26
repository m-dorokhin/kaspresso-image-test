package com.example.kaspressoimagetest

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.kaspressoimagetest.screens.MainScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest : TestCase() {
    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun useAppContext() = run {
        step("Check good image") {
            MainScreen.goodImage.hasDrawable(R.drawable.ic_launcher_foreground)
        }
        step("Check bad image") {
            MainScreen.badImage.hasDrawable(R.drawable.ic_launcher_foreground)
        }
    }
}