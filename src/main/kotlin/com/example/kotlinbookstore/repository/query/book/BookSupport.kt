package com.example.kotlinbookstore.repository.query.book

import com.example.kotlinbookstore.entity.Book

interface BookSupport {

    fun getAllBooks(): List<Book>
}