CREATE TABLE IF NOT EXISTS developers(
    id UUID PRIMARY KEY,
    name VARCHAR UNIQUE NOT NULL,
    surname  VARCHAR
);
