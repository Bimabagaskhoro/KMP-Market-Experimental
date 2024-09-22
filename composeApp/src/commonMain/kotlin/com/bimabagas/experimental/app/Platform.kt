package com.bimabagas.experimental.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform