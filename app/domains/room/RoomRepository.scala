package domains.room

trait RoomRepository {
  def getByName(name: String): RoomEntity

  def listAll(): Seq[RoomEntity]

  def insert(room: RoomEntity): Long
}
