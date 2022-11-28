package com.example.kotlinbookstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
@ConfigurationPropertiesScan
class KotlinBookStoreApplication

fun main(args: Array<String>) {
	runApplication<KotlinBookStoreApplication>(*args)
}
