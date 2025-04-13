CREATE TABLE IF NOT EXISTS user
(
  id int not null auto_increment,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  role VARCHAR(30) NULL,
  primary key (id)
);

