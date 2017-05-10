# roomsテーブルの作成

# --- !Ups
CREATE TABLE IF NOT EXISTS rooms(
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL UNIQUE,
  created_at datetime(6) NOT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

# --- !Downs
DROP TABLE IF EXISTS rooms;
