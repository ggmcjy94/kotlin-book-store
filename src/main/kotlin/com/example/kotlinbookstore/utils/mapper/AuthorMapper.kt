package com.example.kotlinbookstore.utils.mapper

import com.example.kotlinbookstore.dto.AuthorDTO
import com.example.kotlinbookstore.dto.BookDTO
import com.example.kotlinbookstore.entity.Author
import org.springframework.stereotype.Component


@Component
class AuthorMapper : Mapper<AuthorDTO, Author>{
    override fun fromEntity(entity: Author): AuthorDTO {
        return AuthorDTO(
            entity.id,
            entity.name,
            entity.books.stream().map { BookDTO(it.id, it.book.title, it.author.name, it.book.publisher.name) }?.toList()
        )
    }

    override fun toEntity(domain: AuthorDTO): Author {
        return Author(
            domain.id,
            domain.name
        )
    }
}