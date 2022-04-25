CREATE TABLE countries(
	id SERIAL PRIMARY KEY,
	country_name varchar (200) NOT NULL,
	capital varchar (200) NOT NULL,
	area  DECIMAL NOT NULL,
	population INTEGER NOT NULL,
	flag varchar (255) NOT NULL,
	map varchar (255) NOT NULL,
	iso_code char (2) NOT NULL,
	latitude DECIMAL NOT NULL,
	longitude DECIMAL NOT NULL
);

CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	email varchar (200) NOT NULL,
	password varchar (100) NOT NULL
	);
	
CREATE TABLE roles(
	id SERIAL PRIMARY KEY,
	name varchar (100) NOT NULL,
	droit varchar (150) NOT NULL
	);
	