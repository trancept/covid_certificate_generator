package fr.dataforgood.config
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Config {
    val appUrl = System.getProperty("url")

    val loadRatio = Integer.getInteger("load", 1).toInt

    val httpProtocol = http
    .baseUrl(appUrl) // Here is the root for all relative URLs
    .acceptHeader("*/*") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("fr,fr-FR;q=0.8")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
}
