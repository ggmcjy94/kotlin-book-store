package com.example.kotlinbookstore.service

import com.example.kotlinbookstore.repository.AuthorRepository
import org.springframework.stereotype.Service

@Service
class AuthorService(private val authorRepository: AuthorRepository) {
}