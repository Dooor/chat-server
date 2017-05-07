# chatsテーブルの作成

# --- !Ups
CREATE TABLE IF NOT EXISTS chats(
  id int(11) NOT NULL AUTO_INCREMENT,
  body varchar(255) NOT NULL,
  sender_name varchar(255) NOT NULL,
  sent_at datetime(6) NOT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

# --- !Downs
DROP TABLE IF EXISTS chats;
