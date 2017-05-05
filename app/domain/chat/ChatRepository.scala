package domain.chat

trait ChatRepository {
  def listAll(): Seq[ChatEntity]
}
