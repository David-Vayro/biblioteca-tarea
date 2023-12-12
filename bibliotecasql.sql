CREATE TABLE libros (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    disponible BOOLEAN DEFAULT TRUE
);

CREATE TABLE usuarios (
   id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
	distrito VARCHAR(100) NOT NULL
);

CREATE TABLE prestamos (
    prestamo_id SERIAL PRIMARY KEY,
    libro_id INT REFERENCES libros(id),
    usuario_id INT REFERENCES usuarios(id)
);

select * from libros
select * from usuarios
select * from prestamos
-- bd libros
insert into libros (titulo, autor, disponible) values ('1981', 'Nettle', true);
insert into libros (titulo, autor, disponible) values ('Othello', 'Nedda', true);
insert into libros (titulo, autor, disponible) values ('Traveller', 'Annelise', false);
insert into libros (titulo, autor, disponible) values ('July Rhapsody (Laam yan sei sap)', 'Vic', false);
insert into libros (titulo, autor, disponible) values ('Beyond the Valley of the Dolls', 'Emalee', true);
insert into libros (titulo, autor, disponible) values ('Last Call, The (Tercera Llamada)', 'Brandy', true);
insert into libros (titulo, autor, disponible) values ('Rimini, Rimini: A Year Later', 'Jarad', true);
insert into libros (titulo, autor, disponible) values ('Tarzan the Fearless', 'Sergei', false);
insert into libros (titulo, autor, disponible) values ('Welcome to Sherwood! The Story of ''The Adventures of Robin Hood''', 'Bartlet', false);
insert into libros (titulo, autor, disponible) values ('Jet Li''s Fearless (Huo Yuan Jia)', 'Ardenia', true);
insert into libros (titulo, autor, disponible) values ('Whom the Gods Wish to Destroy (Nibelungen, Teil 1: Siegfried, Die)', 'Alica', true);
insert into libros (titulo, autor, disponible) values ('Benigni', 'Marcello', false);
insert into libros (titulo, autor, disponible) values ('Man of a Thousand Faces', 'Viva', false);
insert into libros (titulo, autor, disponible) values ('Fitzwilly', 'Arielle', false);
insert into libros (titulo, autor, disponible) values ('Distant Drums', 'Pippo', true);
insert into libros (titulo, autor, disponible) values ('Nightcap (Merci pour le chocolat)', 'Earle', false);
insert into libros (titulo, autor, disponible) values ('Tokyo Joe', 'Lars', true);
insert into libros (titulo, autor, disponible) values ('Woman In Berlin, A (Anonyma - Eine Frau in Berlin)', 'Rachelle', false);
insert into libros (titulo, autor, disponible) values ('Ringu 0: Bâsudei', 'Even', true);
insert into libros (titulo, autor, disponible) values ('Godzilla 2000 (Gojira ni-sen mireniamu)', 'Dunc', true);

-- bd usuarios
insert into usuarios (nombre, apellido, distrito) values ('Cyrillus', 'Shillabear', 'Mushie');
insert into usuarios (nombre, apellido, distrito) values ('Waite', 'Pennetta', 'Tataouine');
insert into usuarios (nombre, apellido, distrito) values ('Alano', 'Joslow', 'Phan Thong');
insert into usuarios (nombre, apellido, distrito) values ('Maximilianus', 'Cockren', 'Balingueo');
insert into usuarios (nombre, apellido, distrito) values ('Kev', 'De Vuyst', 'Niquero');
insert into usuarios (nombre, apellido, distrito) values ('Stanislaw', 'Rosenbush', '‘Ibrī');
insert into usuarios (nombre, apellido, distrito) values ('Arney', 'Gravey', 'Caibarién');
insert into usuarios (nombre, apellido, distrito) values ('Siffre', 'Sexcey', 'Antonina');
insert into usuarios (nombre, apellido, distrito) values ('Gabe', 'Malyan', 'Chalchuapa');
insert into usuarios (nombre, apellido, distrito) values ('Mose', 'Dearnaly', 'El Capulin');
insert into usuarios (nombre, apellido, distrito) values ('Antoni', 'Clutheram', 'Carodok');
insert into usuarios (nombre, apellido, distrito) values ('Sarge', 'Swalwell', 'Lingyang');
insert into usuarios (nombre, apellido, distrito) values ('Bran', 'Baylis', 'Dongshan');
insert into usuarios (nombre, apellido, distrito) values ('Armstrong', 'Fulks', 'Khamyāb');
insert into usuarios (nombre, apellido, distrito) values ('Cord', 'Gogin', 'Vershino-Shakhtaminskiy');
insert into usuarios (nombre, apellido, distrito) values ('Arron', 'Scneider', 'San Antonio');
insert into usuarios (nombre, apellido, distrito) values ('Malvin', 'Briddock', 'Kampunganyar');
insert into usuarios (nombre, apellido, distrito) values ('Sylas', 'Incogna', 'Los Charrúas');
insert into usuarios (nombre, apellido, distrito) values ('Westleigh', 'Snary', 'Kulpin');
insert into usuarios (nombre, apellido, distrito) values ('Roderich', 'Condict', 'Yushan');