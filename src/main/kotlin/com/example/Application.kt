package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        install(Routing){
            homeRoute()
        }

    }.start(wait = true)
}



fun Routing.homeRoute(){
    get("/pr") {
        call.respond("Hello PrKTOR")
    }
}
