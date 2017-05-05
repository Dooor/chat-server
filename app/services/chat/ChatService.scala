package services.chat

import javax.inject._

import domain.chat.{ChatRepository, ChatEntity}

trait ChatService {
  def listAll(): Seq[ChatEntity]
}

@Singleton
class ChatServiceImpl @Inject() (chatRepository: ChatRepository) extends ChatService {

  override def listAll(): Seq[ChatEntity] = {
    return chatRepository.listAll()
  }

}
