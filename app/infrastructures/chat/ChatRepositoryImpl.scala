package infrastructures.chat

import domains.chat.{ChatRepository, ChatEntity}
import scalikejdbc._
import scalikejdbc.jsr310._
import skinny.orm.{Alias, SkinnyCRUDMapper}

class ChatRepositoryImpl extends SkinnyCRUDMapper[ChatEntity] with ChatRepository {
  override lazy val defaultAlias: Alias[ChatEntity] = createAlias("c")
  override lazy val tableName: String = "chats"
  private[this] lazy val c = defaultAlias

  override def listAll(): Seq[ChatEntity] = findAll()

  override def extract(rs: WrappedResultSet, rn: ResultName[ChatEntity]): ChatEntity = ChatEntity(
    id = Some(rs.int(rn.id)),
    body = rs.string(rn.body),
    senderName = rs.string(rn.senderName),
    sentAt = rs.zonedDateTime(rn.sentAt)
  )

  override def insert(chat: ChatEntity): Long = createWithNamedValues(
    column.body -> chat.body,
    column.senderName -> chat.senderName,
    column.sentAt -> chat.sentAt
  )

}

