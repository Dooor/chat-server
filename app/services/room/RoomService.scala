package services.room

import domains.room.{RoomRepository, RoomEntity}
import java.time.ZonedDateTime
import javax.inject._

trait RoomService {
  def listAll(): Seq[RoomEntity]
  def enter(name: String): RoomEntity
  def create(name: String): Unit
}

@Singleton
class RoomServiceImpl @Inject() (roomRepository: RoomRepository) extends RoomService {

  override def listAll(): Seq[RoomEntity] = {
    return roomRepository.listAll()
  }

  override def enter(name: String): RoomEntity = {
    roomRepository.getByName(name)
  }

  override def create(name: String): Unit = {
    val room = RoomEntity(None, name, ZonedDateTime.now())
    roomRepository.insert(room)
  }

}
