package domains.room

trait RoomRepository {
  def listAll(): Seq[RoomEntity]

  def insert(room: RoomEntity): Long
}
