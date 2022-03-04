package com.example.finaltask.models

import androidx.compose.ui.graphics.Outline

data class UserResponse(
    var status: Boolean,
    var message: String,
    var data: Outline.Generic,
    var token: String
)
