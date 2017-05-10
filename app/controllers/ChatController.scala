package controllers

import domains.chat.ChatEntity
import domains.chat.ChatEntityJsonProtocol._
import javax.inject._
import play.api.mvc._
import play.api.libs.json.Json
import services.chat.ChatService
import spray.json._

@Singleton
class ChatController @Inject() (chatService: ChatService) extends Controller {

  def index(name: String): Action[AnyContent] = Action {
    val chatEntities: Seq[ChatEntity] = chatService.listAll()
    Ok(chatEntities.toJson.prettyPrint)
  }

  def create(name: String) = Action(parse.json) { request =>
    val body = (request.body \ "body").as[String]
    val senderName = (request.body \ "senderName").as[String]
    chatService.send(body, senderName, name)

    val result = Map("status" -> "ok", "method" -> "POST")
    Ok(Json.toJson(result))
  }

}
