package com.example.kotlinbookstore.web.request

data class BookCreateRequest (
    var id : Long = -1,
    var title: String,
    var publisherId : Long,
    var AuthorId : Long

    ) {
}