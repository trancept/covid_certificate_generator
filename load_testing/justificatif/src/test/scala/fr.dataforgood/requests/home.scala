package fr.dataforgood.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Home {
    val home = 
    exec(
        http("home")
        .get("/")
        .check(status.is(200))
    )
}
