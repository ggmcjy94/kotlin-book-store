package com.example.kotlinbookstore.entity

import javax.persistence.*

@Entity
data class Publisher (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long,

    val name : String,

    @OneToMany(mappedBy = "publisher", cascade = [CascadeType.ALL], orphanRemoval = true)
    val books : List<Book>

    ) : BaseTimeEntity()
{
}