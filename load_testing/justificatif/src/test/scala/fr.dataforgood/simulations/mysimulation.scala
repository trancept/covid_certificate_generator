package fr.dataforgood.simulations

import fr.dataforgood.config.Config._
import fr.dataforgood.scenarios._
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import scala.concurrent.duration._

class MySimulation extends Simulation {
    private val userInjection = MyScenario.getPDF
    .inject(
        incrementConcurrentUsers(1*loadRatio)
        .times(5) // Ramp numbers
        .eachLevelLasting(1 minutes)
        .separatedByRampsLasting(1 minute)
    )
    setUp(userInjection).protocols(httpProtocol)
}
