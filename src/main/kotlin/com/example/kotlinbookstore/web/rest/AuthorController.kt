package com.example.kotlinbookstore.web.rest

import com.example.kotlinbookstore.dto.AuthorDTO
import com.example.kotlinbookstore.service.AuthorService
import com.example.kotlinbookstore.web.request.AuthorCreateRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/author")
class AuthorController(private val authorService: AuthorService) {

    @PostMapping
    fun createAuthor (@RequestBody authorCreateRequest: AuthorCreateRequest) : ResponseEntity<AuthorDTO>{
        return ResponseEntity(authorService.createAuthor(authorCreateRequest), HttpStatus.CREATED)
    }


}