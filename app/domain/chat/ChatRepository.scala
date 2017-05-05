package domain.chat

trait ChatRepository {
  def listAll(): Seq[ChatEntity]

  def insert(chat: ChatEntity): Long
}
