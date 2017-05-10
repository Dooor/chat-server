package domains.room

import cores.spray.ZonedDateTimeImplicits._
import java.time.ZonedDateTime
import spray.json._

final case class RoomEntity(
                             id: Option[Int] = None,
                             name: String,
                             createdAt: ZonedDateTime
                           ) {
}

object RoomEntityJsonProtocol extends DefaultJsonProtocol {
  implicit val format: RootJsonFormat[RoomEntity] = jsonFormat3(RoomEntity)
}
