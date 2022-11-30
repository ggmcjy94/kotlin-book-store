package com.example.kotlinbookstore.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import java.util.stream.Stream

@JsonInclude(value = JsonInclude.Include.NON_NULL)
data class AuthorDTO(
    var id: Long,
    var name: String,
    var book: List<BookDTO>?
) {
}