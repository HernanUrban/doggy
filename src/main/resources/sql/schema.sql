CREATE TABLE IF NOT EXISTS dogs (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  name                   VARCHAR      NOT NULL,
  breed                  VARCHAR      NOT NULL
);
