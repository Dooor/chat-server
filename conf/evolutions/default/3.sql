# chatsテーブルにroom_nameカラム追加

# --- !Ups
ALTER TABLE chats ADD room_name varchar(255) NOT NULL AFTER sender_name;

# --- !Downs
ALTER TABLE chats DROP room_name;
