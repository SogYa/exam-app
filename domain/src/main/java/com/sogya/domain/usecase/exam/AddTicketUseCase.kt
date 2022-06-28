package com.sogya.domain.usecase.exam

import com.sogya.domain.models.Ticket
import com.sogya.domain.repository.ExamRepository

class AddTicketUseCase(private val examRepository: ExamRepository) {

    fun addTicket(wrongAnswerThemeId: Int): List<Ticket> {
        return examRepository.addTickets(wrongAnswerThemeId)
    }
}