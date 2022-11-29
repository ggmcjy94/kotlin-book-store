package com.example.kotlinbookstore.repository

import com.example.kotlinbookstore.entity.Book
import com.example.kotlinbookstore.repository.query.BookSupport
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<Book, Long> , BookSupport {
}