DROP TABLE IF EXISTS item;

CREATE TABLE Item
(
    ITEM_ID     SERIAL PRIMARY KEY,
    Title       VARCHAR(40),
    Artist      VARCHAR(40),
    ReleaseDate DATE,
    ListPrice   NUMERIC(5,2),
    Price       NUMERIC(5,2),
    Version     NUMERIC(5)
);

INSERT INTO Item (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES
                ('Diva', 'Annie Lennox', '1992-01-04', 17.97, 13.99,1),
                ('Dream of the Blue Turtles', 'Sting', '1985-02-05', 17.97, 14.99,1),
                ('Trouble is...', 'Kenny Wayne Shepherd Band', '1997-08-08', 17.97, 14.99,1),
                ('Lie to Me', 'Jonny Lang', '1997-08-26', 17.97, 14.99,1),
                ('Little Earthquakes', 'Tori Amos', '1992-01-18', 17.97, 14.99,1),
                ('Seal', 'Seal', '1991-08-18', 17.97, 14.99,1),
                ('Ian Moore', 'Ian Moore', '1993-12-05', 9.97, 9.97,1),
                ('So Much for the Afterglow', 'Everclear', '1997-01-19', 16.97, 13.99,1),
                ('Surfacing', 'Sarah McLachlan', '1997-12-04', 17.97, 13.99,1),
                ('Hysteria', 'Def Leppard', '1987-06-20', 17.97, 14.99,1),
                ('A Life of Saturdays', 'Dexter Freebish', '2000-12-06', 16.97, 12.99,1),
                ('Human Clay', 'Creed', '1999-10-21', 18.97, 13.28,1),
                ('My, I''m Large', 'Bobs', '1987-02-20', 11.97, 11.97,1),
                ('So', 'Peter Gabriel', '1986-10-03', 17.97, 13.99,1),
                ('Big Ones', 'Aerosmith', '1994-05-08', 18.97, 14.99,1),
                ('90125', 'Yes', '1983-10-16', 11.97, 11.97,1),
                ('1984', 'Van Halen', '1984-08-19', 11.97, 11.97,1),
                ('Escape', 'Journey', '1981-02-25', 11.97, 11.97,1),
                ('Greatest Hits', 'Jay and the Americans', '1966-12-05', 13.99, 9.97,1),
                ('Ray of Light', 'Madonna', '2000-12-15', 14.99, 10.97,1),
                ('Music', 'Madonna', '2002-02-27', 14.99, 11.97,1);


COMMIT;
