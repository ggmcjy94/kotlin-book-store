package com.example.kotlinbookstore.service

import com.example.kotlinbookstore.dto.PublisherDTO
import com.example.kotlinbookstore.entity.Publisher
import com.example.kotlinbookstore.repository.PublisherRepository
import com.example.kotlinbookstore.web.request.PublisherCreateRequest
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class PublisherService (private val publisherRepository: PublisherRepository) {

    fun createPublisher(@RequestBody request: PublisherCreateRequest) : PublisherDTO {

        if (request.id != -1L) {
            throw IllegalArgumentException("Id must be null or -1")
        }

        val publisher = publisherRepository.save(Publisher(request.id, request.name))
        return PublisherDTO(publisher.id, publisher.name, null)

    }
    fun getPublisher(id: Long) : Publisher =
        publisherRepository.findById(id)
            .orElseThrow{ IllegalArgumentException("publisher_Id is Not found $id") }

}