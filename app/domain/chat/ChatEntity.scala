package domain.chat

import spray.json._

final case class ChatEntity(
                             id: Option[Int] = None,
                             body: String,
                             senderName: String
                           )

object ChatEntityJsonProtocol extends DefaultJsonProtocol {
  implicit val format: RootJsonFormat[ChatEntity] = jsonFormat3(ChatEntity)
}
