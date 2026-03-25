package com.example.lab2again

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform