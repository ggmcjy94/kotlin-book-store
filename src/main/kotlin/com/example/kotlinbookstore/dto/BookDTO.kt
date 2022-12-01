package com.example.kotlinbookstore.dto

data class BookDTO (
    var id:Long,
    var title: String,
    var author: List<AuthorDTO>,
    var publisherName: String
){
}