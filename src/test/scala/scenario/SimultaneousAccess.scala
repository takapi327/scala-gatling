
package scenario

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object SimultaneousAccess {

  private lazy val ACCESS_DURATION = 7
  private lazy val ACCESS_USER     = 8

  private val scn = scenario("Simultaneous Access Site")
    .exec(http("Request Person").get("/person")).pause(ACCESS_DURATION)

  val scenarioAccess = scn.inject(atOnceUsers(ACCESS_USER))
}
