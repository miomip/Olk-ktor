package me.silent

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.response.*

fun Application.configureHttp() {
    install(CORS) {
        allowMethod(HttpMethod.Get)
        allowHeader(HttpHeaders.Authorization)
    }
}
