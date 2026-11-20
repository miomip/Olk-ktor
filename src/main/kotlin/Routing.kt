package me.silent

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        authenticate("basicAuth") {
            staticResources("/", "static")
        }
    }
}