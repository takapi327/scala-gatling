
import scenario.SimultaneousAccess

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class AccessSimulation extends Simulation {

  lazy val httpProtocol = http.baseUrl("http://localhost:9000")
    //.acceptHeader("")
    //.acceptEncodingHeader("")
    //.acceptLanguageHeader("")
    //.userAgentHeader("")

  setUp(SimultaneousAccess.scenarioAccess.protocols(httpProtocol))
}
