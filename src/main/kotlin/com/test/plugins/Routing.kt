package com.test.plugins

import com.test.routes.customerRoutes
import com.test.routes.getOrderRoute
import com.test.routes.listOrderRoute
import com.test.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRoutes()
        listOrderRoute()
        getOrderRoute()
        totalizeOrderRoute()

    }
}
