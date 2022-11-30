package com.example.kotlinbookstore.web.request

import com.example.kotlinbookstore.entity.Author

data class AuthorCreateRequest(
    var id : Long = -1,
    var name: String
) {
}