package domains.chat

trait ChatRepository {
  def listByRoomName(roomName: String): Seq[ChatEntity]

  def listAll(): Seq[ChatEntity]

  def insert(chat: ChatEntity): Long
}
