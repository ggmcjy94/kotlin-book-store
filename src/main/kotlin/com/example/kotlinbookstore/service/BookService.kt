package com.example.kotlinbookstore.service

import com.example.kotlinbookstore.dto.BookDTO
import com.example.kotlinbookstore.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository){

    fun getBooks(){
        val books = bookRepository.getAllBooks()

    }
}