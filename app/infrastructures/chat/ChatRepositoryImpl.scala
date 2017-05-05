package infrastructures.chat

import domain.chat.ChatRepository

class ChatRepositoryImpl extends ChatRepository {
  override def listAll(): Map[String, String] = {
    return Map("status" -> "OK")
  }
}

