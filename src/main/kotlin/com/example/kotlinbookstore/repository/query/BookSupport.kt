package com.example.kotlinbookstore.repository.query

import com.example.kotlinbookstore.entity.Book

interface BookSupport {

    fun getAllBooks(): List<Book>
}