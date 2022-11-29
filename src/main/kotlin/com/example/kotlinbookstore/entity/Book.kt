package com.example.kotlinbookstore.entity

import javax.persistence.*

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long,

    val title : String,

    @OneToMany(mappedBy = "book", cascade = [CascadeType.ALL], orphanRemoval = true)
    val authors: List<BookAuthor>,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    val publisher: Publisher

) : BaseTimeEntity() {
}