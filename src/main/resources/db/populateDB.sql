DELETE FROM user_roles;
DELETE FROM lunch_menu;
DELETE FROM users;
DELETE FROM restaurant;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO RESTAURANT (RESTAURANT_ID,DESCRIPTION) VALUES (100002,'Tokyo'), (100003,'MacDac');

INSERT INTO USERS (NAME, EMAIL, PASSWORD)
VALUES ('Admin', 'admin@yandex.ru', 'password'), ('User', 'user@yandex.ru', 'user');

INSERT INTO USER_ROLES (USER_ID, ROLE) VALUES (100000, 'ROLE_ADMIN'), (100001, 'ROLE_USER');


INSERT INTO LUNCH_MENU (RESTAURANT_ID, DESCRIPTION, PRICE) VALUES
  (100002, 'Горшочек с мясом', 5.25),
  (100002, 'Салатик', 1.5),
  (100002, 'Супчик', 2.25),
  (100002, 'Компот', 0.75),
  (100003, 'Chicken McNuggets', 2.5),
  (100003, 'Hamburger', 2.0),
  (100003, 'Coca-Cola', 1.5);

