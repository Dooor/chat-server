package services.chat

import javax.inject._

trait ChatService {
  def listAll(): Map[String, String]
}

@Singleton
class ChatServiceImpl @Inject() extends ChatService {

  override def listAll(): Map[String, String] = {
    return Map("status" -> "ok")
  }

}
