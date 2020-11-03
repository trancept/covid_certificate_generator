package fr.dataforgood.scenarios

import fr.dataforgood.requests._
import io.gatling.core.Predef._
import io.gatling.core.Predef.scenario

object MyScenario {
    val getPDF = scenario("Get PDF")
    .exec(Home.home)
    //.exec(PDF.pdf)
}
