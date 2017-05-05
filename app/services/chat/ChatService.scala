package services.chat

import javax.inject._

import domain.chat.ChatRepository

trait ChatService {
  def listAll(): Map[String, String]
}

@Singleton
class ChatServiceImpl @Inject() (chatRepository: ChatRepository) extends ChatService {

  override def listAll(): Map[String, String] = {
    return chatRepository.listAll()
  }

}
