package com.onats.kmmstorage

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform