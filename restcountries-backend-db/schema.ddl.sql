CREATE TABLE countries(
	id SERIAL PROMARY KEY,
	country_name varchar (200) NOT NULL,
	capital varchar (200) NOT NULL,
	area varchar INTEGER NOT NULL,
	population INTEGER NOT NULL,
	flag varchar (255) NOT NULL,
	map varchar (255) NOT NULL,
	iso_code char (2) NOT NULL,
	latitude DECIMAL NOT NULL,
	longitude DECIMAL NOT NULL,
);