package com.example.kotlinbookstore.service

import com.example.kotlinbookstore.dto.BookDTO
import com.example.kotlinbookstore.entity.Book
import com.example.kotlinbookstore.entity.BookAuthor
import com.example.kotlinbookstore.repository.BookAuthorRepository
import com.example.kotlinbookstore.repository.BookRepository
import com.example.kotlinbookstore.web.request.BookCreateRequest
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository,
                  private val bookAuthorRepository: BookAuthorRepository,
                  private val publisherService: PublisherService,
                  private val authorService: AuthorService
){


    fun createBook(request: BookCreateRequest) : BookDTO {

        if (request.id != -1L) {
            throw IllegalArgumentException("Id must be null or -1")
        }
        val book = Book(request.id, request.title)
        val publisher = publisherService.getPublisher(request.publisherId)
        book.setPublisher(publisher)
        val author = authorService.getAuthor(request.AuthorId)

        val savedBook = bookRepository.save(book)

        bookAuthorRepository.save(BookAuthor(id=-1, book = savedBook , author = author))

        return BookDTO(savedBook.id, savedBook.title, author.name, publisher.name)
    }

    fun getBook(id: Long): BookDTO {
        val book = findById(id)
        val bookAuthor = bookAuthorRepository.findByBookId(book.id)
        return BookDTO(book.id,book.title, bookAuthor.author.name, book.publisher.name)
    }


    fun findById (id : Long) :Book {
        return bookRepository.findById(id)
            .orElseThrow {
                IllegalArgumentException("book_Id is Not found $id")
            }

    }
}