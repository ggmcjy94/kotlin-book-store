package com.example.kotlinbookstore.dto

data class PublisherDTO(
    var id : Long,
    var name: String,
    var book: List<BookDTO>
) {
}