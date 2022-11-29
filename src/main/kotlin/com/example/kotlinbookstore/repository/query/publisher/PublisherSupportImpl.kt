package com.example.kotlinbookstore.repository.query.publisher

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository

@Repository
class PublisherSupportImpl(private val query: JPAQueryFactory) : PublisherSupport {

}