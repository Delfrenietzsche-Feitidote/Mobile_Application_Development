package com.example.mindfulness30

import androidx.annotation.DrawableRes

/**
 * Data class representing a mindfulness tip.
 */
data class Tip(
    val day: Int,
    val title: String,
    val description: String,
    @DrawableRes val imageRes: Int
)