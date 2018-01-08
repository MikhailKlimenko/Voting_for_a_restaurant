DROP TABLE user_roles IF EXISTS;
DROP TABLE lunch_menu IF EXISTS;
DROP TABLE users IF EXISTS;
DROP TABLE restaurant IF EXISTS;


CREATE SEQUENCE GLOBAL_SEQ AS INTEGER START WITH 100000;

CREATE TABLE restaurant
(
  restaurant_id INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
  description          VARCHAR(255) NOT NULL
);

CREATE TABLE users
(
  id         INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
  name       VARCHAR(255)            NOT NULL,
  email      VARCHAR(255)            NOT NULL,
  restaurant_id    INTEGER,
  password   VARCHAR(255)            NOT NULL,
  registered TIMESTAMP DEFAULT now() NOT NULL,
  enabled    BOOLEAN DEFAULT TRUE    NOT NULL,
  FOREIGN KEY (cafe_id) REFERENCES restaurant (restaurant_id)
    ON DELETE CASCADE
);

CREATE UNIQUE INDEX user_unique_email_idx
  ON users (email);


CREATE TABLE user_roles
(
  user_id INTEGER NOT NULL,
  role    VARCHAR(255),
  CONSTRAINT user_roles_idx UNIQUE (user_id, role),
  FOREIGN KEY (user_id) REFERENCES users (id)
    ON DELETE CASCADE
);

CREATE TABLE lunch_menu
(
  lunch_menu_id INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
  restaurant_id       INTEGER      NOT NULL,
  description   VARCHAR(255) NOT NULL,
  price         NUMERIC,
  FOREIGN KEY (cafe_id) REFERENCES restaurant (restaurant_id)
    ON DELETE CASCADE
) ;


