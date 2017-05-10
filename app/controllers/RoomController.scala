package controllers

import javax.inject._
import play.api.libs.json.Json
import play.api.mvc._
import services.room.RoomService

@Singleton
class RoomController @Inject() (roomService: RoomService) extends Controller {
  def create = Action(parse.json) { request =>
    val name = (request.body \ "name").as[String]
    roomService.create(name)

    val result = Map("status" -> "ok", "method" -> "POST")
    Ok(Json.toJson(result))
  }
}
