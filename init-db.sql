CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  username VARCHAR(50) UNIQUE NOT NULL,
  password VARCHAR(255) NOT NULL
);
CREATE TABLE tasks (
  id SERIAL PRIMARY KEY,
  title VARCHAR(200) NOT NULL,
  description TEXT,
  status VARCHAR(20),
  user_id INTEGER REFERENCES users(id)
);
INSERT INTO users(username,password) VALUES ('admin','admin123');
INSERT INTO tasks(title,description,status,user_id) VALUES
 ('Initial Task','Seed data','OPEN',1);
