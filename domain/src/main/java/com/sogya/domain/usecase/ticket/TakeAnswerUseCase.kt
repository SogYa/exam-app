package com.sogya.domain.usecase.ticket

import com.sogya.domain.repository.TicketRepository

class TakeAnswerUseCase(private val ticketRepository: TicketRepository) {
    fun takeAnswer(answerId: Int, ticketId: Int): Boolean {
        return ticketRepository.takeAnswer(answerId, ticketId)
    }
}