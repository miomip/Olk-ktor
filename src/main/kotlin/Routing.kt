package me.silent

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import freemarker.cache.*
import io.ktor.server.freemarker.*
import io.ktor.resources.*
import io.ktor.server.resources.*
import io.ktor.server.resources.Resources
import kotlinx.serialization.Serializable
import io.ktor.server.auth.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        authenticate("basicAuth") {
            staticResources("/", "static")
        }
    }
}