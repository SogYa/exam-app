package com.sogya.domain.repository

import com.sogya.domain.models.Ticket

interface TicketRepository {

    fun getTicket():Ticket
    fun takeAnswer(answerId:Int,ticketId: Int ):Boolean

}