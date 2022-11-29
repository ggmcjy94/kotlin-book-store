package com.example.kotlinbookstore.dto

data class AuthorDTO (
    var id : Long,
    var name : String,
    var book : List<BookDTO>
) {
}