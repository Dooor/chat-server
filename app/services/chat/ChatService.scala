package services.chat

import javax.inject._

import java.time.ZonedDateTime

import domains.chat.{ChatRepository, ChatEntity}

trait ChatService {
  def listByRoomName(roomName: String): Seq[ChatEntity]
  def listAll(): Seq[ChatEntity]
  def send(body: String, senderName: String, roomName: String): Unit
}

@Singleton
class ChatServiceImpl @Inject() (chatRepository: ChatRepository) extends ChatService {

  override def listByRoomName(roomName: String): Seq[ChatEntity] = {
    return chatRepository.listByRoomName(roomName)
  }

  override def listAll(): Seq[ChatEntity] = {
    return chatRepository.listAll()
  }

  override def send(body: String, senderName: String, roomName: String): Unit = {
    val chat = ChatEntity(None, body, senderName, roomName, ZonedDateTime.now())
    chatRepository.insert(chat)
  }

}
