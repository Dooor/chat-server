package infrastructures.chat

import domain.chat.{ChatRepository, ChatEntity}
import scalikejdbc._
import skinny.orm.{Alias, SkinnyCRUDMapper}

class ChatRepositoryImpl extends SkinnyCRUDMapper[ChatEntity] with ChatRepository {
  override lazy val defaultAlias: Alias[ChatEntity] = createAlias("c")
  override lazy val tableName: String = "chats"
  private[this] lazy val c = defaultAlias

  override def listAll(): Seq[ChatEntity] = findAll()

  override def extract(rs: WrappedResultSet, rn: ResultName[ChatEntity]): ChatEntity = ChatEntity(
    id = Some(rs.int(rn.id)),
    body = rs.string(rn.body),
    senderName = rs.string(rn.senderName)
  )

}

