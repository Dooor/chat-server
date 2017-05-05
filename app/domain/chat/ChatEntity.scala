package domain.chat

final case class ChatEntity(
                             id: Option[Int] = None,
                             body: String,
                             senderName: String
                           )
