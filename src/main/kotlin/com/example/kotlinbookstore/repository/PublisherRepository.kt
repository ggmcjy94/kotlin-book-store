package com.example.kotlinbookstore.repository

import com.example.kotlinbookstore.entity.Publisher
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PublisherRepository : JpaRepository<Publisher, Long>{
}