package com.example.kotlinbookstore.entity

import javax.persistence.*

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long,
    val title : String

) : BaseTimeEntity() {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    lateinit var publisher : Publisher
        private set


    @OneToMany(mappedBy = "book", cascade = [CascadeType.ALL], orphanRemoval = true)
    val authors: List<BookAuthor> = listOf()


    fun setPublisher(publisher: Publisher) {
        this.publisher = publisher
    }
}