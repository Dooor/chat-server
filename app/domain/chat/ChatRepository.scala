package domain.chat

trait ChatRepository {
  def listAll(): Map[String, String]
}
