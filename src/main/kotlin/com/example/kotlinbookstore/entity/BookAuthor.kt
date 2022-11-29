package com.example.kotlinbookstore.entity

import javax.persistence.*

@Entity
data class BookAuthor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    val book: Book,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    val author: Author
        ): BaseTimeEntity (){
}