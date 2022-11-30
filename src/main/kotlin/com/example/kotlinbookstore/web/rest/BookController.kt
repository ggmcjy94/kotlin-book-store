package com.example.kotlinbookstore.web.rest

import com.example.kotlinbookstore.dto.BookDTO
import com.example.kotlinbookstore.service.BookService
import com.example.kotlinbookstore.web.request.BookCreateRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/books")
class BookController(private val bookService: BookService) {

    @PostMapping
    fun createBook(@RequestBody request: BookCreateRequest) : ResponseEntity<BookDTO> =
        ResponseEntity(bookService.createBook(request), HttpStatus.CREATED)

    @GetMapping("/{id}")
    fun getBook(@PathVariable("id") id : Long):ResponseEntity<BookDTO> = ResponseEntity(bookService.getBook(id), HttpStatus.OK)
}