package com.example.kotlinbookstore.dto

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(value = JsonInclude.Include.NON_NULL)
data class PublisherDTO(
    var id : Long,
    var name: String,
    var book: List<BookDTO>?
) {
}