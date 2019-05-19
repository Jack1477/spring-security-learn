DROP TABLE IF EXISTS USER;

CREATE TABLE IF NOT EXISTS USER
(
  id int primary key auto_increment,
  username varchar(32) not null ,
  password varchar(32) not null ,
  salt varchar(50) not null
)