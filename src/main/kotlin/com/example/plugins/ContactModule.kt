package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.aboutcontact(){
    routing {
        get("/contact"){
        call.respondText("This is Contact Page")        }
    }
}