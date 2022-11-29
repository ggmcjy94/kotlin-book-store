package com.example.kotlinbookstore.entity



import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long,
    val name : String
) : BaseTimeEntity() {
}