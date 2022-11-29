package com.example.kotlinbookstore.entity



import javax.persistence.*

@Entity
data class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long,

    val name : String,

    @OneToMany(mappedBy = "author", cascade = [CascadeType.ALL], orphanRemoval = true)
    val books: List<BookAuthor>

) : BaseTimeEntity() {
}