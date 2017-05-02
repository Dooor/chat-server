package controllers

import javax.inject._

import play.api.mvc._
import play.api.libs.json.Json
import services.chat.ChatService

@Singleton
class ChatController @Inject() (chatService: ChatService) extends Controller {

  def index: Action[AnyContent] = Action {
    Ok(Json.toJson(chatService.listAll()))
  }

}
