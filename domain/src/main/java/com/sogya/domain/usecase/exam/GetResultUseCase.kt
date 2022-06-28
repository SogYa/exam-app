package com.sogya.domain.usecase.exam

import com.sogya.domain.repository.ExamRepository

class GetResultUseCase(private val examRepository: ExamRepository) {

    fun getResult() {
        return examRepository.getResultOfExam()
    }
}