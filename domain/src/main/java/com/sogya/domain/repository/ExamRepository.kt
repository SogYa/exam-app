package com.sogya.domain.repository

import com.sogya.domain.models.Ticket

interface ExamRepository {

    fun startExam(): List<Ticket>

    fun getResultOfExam()

    fun addTickets(wrongAnswerThemeId: Int): List<Ticket>
}