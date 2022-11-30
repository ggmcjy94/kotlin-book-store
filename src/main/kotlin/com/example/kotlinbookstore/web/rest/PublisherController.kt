package com.example.kotlinbookstore.web.rest

import com.example.kotlinbookstore.dto.PublisherDTO
import com.example.kotlinbookstore.service.PublisherService
import com.example.kotlinbookstore.web.request.PublisherCreateRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/publisher")
class PublisherController (private val publisherService: PublisherService) {

    @PostMapping
    fun createPublisher(@RequestBody publisherCreateRequest: PublisherCreateRequest) : ResponseEntity<PublisherDTO> =
        ResponseEntity(publisherService.createPublisher(publisherCreateRequest),HttpStatus.CREATED)


}