package com.example.plugins

import io.ktor.server.application.*
import org.koin.ktor.ext.getKoin
import org.koin.ktor.plugin.koin
import org.koin.logger.slf4jLogger


fun Application.configureKoin(){
    koin {
        slf4jLogger()
    }
}