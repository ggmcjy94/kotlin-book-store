package com.example.kotlinbookstore.repository.query.author

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository


@Repository
class AuthorSupportImpl(private val query : JPAQueryFactory) : AuthorSupport {

}