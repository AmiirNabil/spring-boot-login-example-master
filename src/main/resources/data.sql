INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

INSERT INTO users (id, email, password, username)
SELECT 1, 'admin@nasnav.com', '$2a$10$u2tDwnBFIzwH9JwvGkJgzu83McsKr8B.9B5FrBd0c1aTUxivw/qDK', 'admin'
WHERE NOT EXISTS (SELECT * FROM users Where username='admin');

INSERT INTO user_roles(user_id, role_id) SELECT 1, 3
WHERE NOT EXISTS (SELECT * FROM user_roles WHERE role_id=1);
