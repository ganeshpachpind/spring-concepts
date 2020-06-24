package com.transaction.learning.anootation.transaction

import java.util.*
import javax.persistence.*


@Entity(name="developers")
data class DeveloperDao(
    @Id
    @GeneratedValue
    @Column(name="id")
    val id: UUID? = null,

    @Column(name = "name", unique = true)
    val name: String,

    @Column(name = "surname")
    val surName: String?
)