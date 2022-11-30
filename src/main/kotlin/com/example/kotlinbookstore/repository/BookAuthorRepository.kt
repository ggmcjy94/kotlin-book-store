package com.example.kotlinbookstore.repository

import com.example.kotlinbookstore.entity.BookAuthor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookAuthorRepository: JpaRepository<BookAuthor, Long> {

    fun findByBookId(id: Long): BookAuthor

}