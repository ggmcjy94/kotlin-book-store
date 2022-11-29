package com.example.kotlinbookstore.repository.query

import com.example.kotlinbookstore.entity.Book
import com.example.kotlinbookstore.entity.QBook
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport
import org.springframework.stereotype.Repository

@Repository
class BookSupportImpl(val query: JPAQueryFactory) : BookSupport {

    override fun getAllBooks(): List<Book> {
       return query.selectFrom(QBook.book).fetch();
    }

}