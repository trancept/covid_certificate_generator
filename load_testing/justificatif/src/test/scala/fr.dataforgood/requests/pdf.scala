package fr.dataforgood.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.util.Random

object PDF {
    val getPDF = 
    pause(1).exec(
        http("Request PDF")
        .post("/")
        .header(HttpHeaderNames.ContentType, "application/x-www-form-urlencoded")
        .body(StringBody("""body"""))
    )
}
