package com.sogya.domain.usecase.exam

import com.sogya.domain.models.Ticket
import com.sogya.domain.repository.ExamRepository

class StartExamUseCase(private val examRepository: ExamRepository) {

    fun startExam(): List<Ticket> {
        return examRepository.startExam()
    }
}