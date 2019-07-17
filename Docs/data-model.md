## DDL for Data Model

```sql
CREATE TABLE IF NOT EXISTS `Movie`
(
    `id`           INTEGER PRIMARY KEY AUTOINCREMENT,
    `title`        TEXT,
    `screenwriter` TEXT,
    `timestamp`    INTEGER,
    `genre`        TEXT
);

CREATE TABLE IF NOT EXISTS `Actor`
(
    `id`   INTEGER PRIMARY KEY AUTOINCREMENT,
    `name` TEXT
);

CREATE TABLE IF NOT EXISTS `Actor`
(
    `id`   INTEGER PRIMARY KEY AUTOINCREMENT,
    `name` TEXT
);

CREATE TABLE IF NOT EXISTS `ActorMovieJoin`
(
    `movieId`       INTEGER NOT NULL,
    `actorId`       INTEGER NOT NULL,
    `characterName` TEXT,
    PRIMARY KEY (`movieId`, `actorId`),
    FOREIGN KEY (`movieId`) REFERENCES `Movie` (`id`) ON UPDATE NO ACTION ON DELETE NO ACTION,
    FOREIGN KEY (`actorId`) REFERENCES `Actor` (`id`) ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE INDEX `index_ActorMovieJoin_movieId` ON `ActorMovieJoin` (`movieId`);

CREATE INDEX `index_ActorMovieJoin_actorId` ON `ActorMovieJoin` (`actorId`);
```