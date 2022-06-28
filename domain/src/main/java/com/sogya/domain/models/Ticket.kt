package com.sogya.domain.models

data class Ticket(
    val id: Int,
    val themeId: Int,
    val imageId: Int? = null,
    val text: String,
    val trueAnswerId: Int,
    val listOfAnswers: List<Answer>
)
