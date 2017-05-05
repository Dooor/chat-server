package controllers

import javax.inject._

import play.api.mvc._
import play.api.libs.json.Json
import spray.json._

import services.chat.ChatService
import domain.chat.ChatEntity
import domain.chat.ChatEntityJsonProtocol._

@Singleton
class ChatController @Inject() (chatService: ChatService) extends Controller {

  def index: Action[AnyContent] = Action {
    val chatEntities: Seq[ChatEntity] = chatService.listAll()
    Ok(chatEntities.toJson.prettyPrint)
  }

  def create: Action[AnyContent] = Action {
    val result = Map("status" -> "ok", "method" -> "POST")
    Ok(Json.toJson(result))
  }
}
