package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json.Json

@Singleton
class ChatController extends Controller {

  def index: Action[AnyContent] = Action {
    Ok(Json.toJson(Map("status" -> "ok")))
  }

}
