package com.example.kotlinbookstore.repository

import com.example.kotlinbookstore.entity.Author
import com.example.kotlinbookstore.repository.query.author.AuthorSupport
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<Author, Long>, AuthorSupport {
}