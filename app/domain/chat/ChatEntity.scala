package domain.chat

import java.time.ZonedDateTime

import cores.spray.ZonedDateTimeImplicits._
import spray.json._

final case class ChatEntity(
                             id: Option[Int] = None,
                             body: String,
                             senderName: String,
                             sentAt: ZonedDateTime
                           ) {
}

object ChatEntityJsonProtocol extends DefaultJsonProtocol {
  implicit val format: RootJsonFormat[ChatEntity] = jsonFormat4(ChatEntity)
}
