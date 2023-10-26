package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: String,
    val name: String,
    val price: Float,
    val categoryId: Int,
)

val productStorage = mutableListOf<Product>()