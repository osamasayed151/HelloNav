package com.example.hellonav.model

import java.io.Serializable

data class Book(
    val id: Int,
    val name: String,
    val description:String,
    val author:String,
    ): Serializable