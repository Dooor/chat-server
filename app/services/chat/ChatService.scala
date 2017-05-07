package services.chat

import javax.inject._

import java.time.ZonedDateTime

import domain.chat.{ChatRepository, ChatEntity}

trait ChatService {
  def listAll(): Seq[ChatEntity]
  def send(body: String, senderName: String): Long
}

@Singleton
class ChatServiceImpl @Inject() (chatRepository: ChatRepository) extends ChatService {

  override def listAll(): Seq[ChatEntity] = {
    return chatRepository.listAll()
  }

  override def send(body: String, senderName: String): Long = {
    val chat = ChatEntity(None, body, senderName, ZonedDateTime.now())
    return chatRepository.insert(chat)
  }

}
