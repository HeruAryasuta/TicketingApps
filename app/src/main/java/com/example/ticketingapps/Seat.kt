package com.example.ticketingapps

data class Seat(
    val id: Int,
    var x: Float? = null,
    var y: Float? = null,
    var name: String,
    var isBooked: Boolean
)
