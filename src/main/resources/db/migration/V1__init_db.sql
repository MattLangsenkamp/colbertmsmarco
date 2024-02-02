CREATE TABLE IF NOT EXISTS Users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(256) NOT NULL,
    password VARCHAR(512),
    date_created TIMESTAMP NOT NULL,
    provider VARCHAR(32) NOT NULL 
);