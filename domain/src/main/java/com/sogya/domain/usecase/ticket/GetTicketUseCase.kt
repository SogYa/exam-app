package com.sogya.domain.usecase.ticket

import com.sogya.domain.models.Ticket
import com.sogya.domain.repository.TicketRepository

class GetTicketUseCase(private val ticketRepository: TicketRepository) {

    fun getTicket(themeId: Int): Ticket {
        return ticketRepository.getTicket()
    }
}