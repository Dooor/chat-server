package infrastructures.room

import domains.room.{RoomRepository, RoomEntity}
import scalikejdbc._
import scalikejdbc.jsr310._
import skinny.orm.{Alias, SkinnyCRUDMapper}

class RoomRepositoryImpl extends SkinnyCRUDMapper[RoomEntity] with RoomRepository {
  override lazy val defaultAlias: Alias[RoomEntity] = createAlias("r")
  override lazy val tableName: String = "rooms"
  private[this] lazy val r = defaultAlias

  override def listAll(): Seq[RoomEntity] = findAll()

  override def extract(rs: WrappedResultSet, rn: ResultName[RoomEntity]): RoomEntity = RoomEntity(
    id = Some(rs.int(rn.id)),
    name = rs.string(rn.name),
    createdAt = rs.zonedDateTime(rn.createdAt)
  )

  override def insert(room: RoomEntity): Long = createWithNamedValues(
    column.name -> room.name,
    column.createdAt -> room.createdAt
  )
}
