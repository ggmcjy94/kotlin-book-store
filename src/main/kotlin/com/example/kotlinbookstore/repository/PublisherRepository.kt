package com.example.kotlinbookstore.repository

import com.example.kotlinbookstore.entity.Publisher
import com.example.kotlinbookstore.repository.query.publisher.PublisherSupport
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PublisherRepository : JpaRepository<Publisher, Long> , PublisherSupport{
}