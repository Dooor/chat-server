package controllers

import javax.inject._
import play.api.libs.json.Json
import play.api.mvc._

@Singleton
class RoomController @Inject() extends Controller {
  def create = Action(parse.json) { request =>
    val name = (request.body \ "name").as[String]

    val result = Map("status" -> "ok", "method" -> "POST")
    Ok(Json.toJson(result))
  }
}
