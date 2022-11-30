package com.example.kotlinbookstore.service

import com.example.kotlinbookstore.dto.AuthorDTO
import com.example.kotlinbookstore.entity.Author
import com.example.kotlinbookstore.repository.AuthorRepository
import com.example.kotlinbookstore.utils.mapper.AuthorMapper
import com.example.kotlinbookstore.web.request.AuthorCreateRequest
import org.springframework.stereotype.Service

@Service
class AuthorService(
    private val authorRepository: AuthorRepository,
    private val authorMapper: AuthorMapper
) {

    fun createAuthor(request : AuthorCreateRequest) : AuthorDTO {
        if (request.id != -1L) {
            throw IllegalArgumentException("Id must be null or -1")
        }
        val author = Author(request.id,request.name)
        val savedAuthor = authorRepository.save(author)
        return AuthorDTO(savedAuthor.id, savedAuthor.name, null)
    }

    fun getAuthor(authorId: Long): Author =
        authorRepository.findById(authorId).orElseThrow{ IllegalArgumentException ("author_Id is Not found $authorId")}



}