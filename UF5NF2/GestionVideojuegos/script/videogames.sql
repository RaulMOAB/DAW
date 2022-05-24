DROP user 'usrgame'@'localhost';
DROP DATABASE videogames;
flush privileges;
-- Create user for local access.
CREATE USER 'usrgame'@'localhost' IDENTIFIED BY 'pswgame';
-- Create database.
CREATE DATABASE videogames
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;
-- Grant permissions.
GRANT SELECT, INSERT, UPDATE, DELETE ON videogames.* TO 'usrgame'@'localhost';
-- Use database.
USE videogames;
-- Create table 'countries'
CREATE TABLE `videogames` (
`Nombre` varchar(50) NOT NULL,
`Plataforma` varchar(20) NOT NULL,
`Unidades` int default 0,
`Online` varchar (2),
PRIMARY KEY (`Nombre`)
) ENGINE=InnoDB;
-- Data insertion.
INSERT INTO `videogames` (`Nombre`, `Plataforma`, `Unidades`, `Online`) 
VALUES
('Elden Ring', 'PS5', '200', 'Si'),
('Sekiro', 'PC', '40', 'No'),
('Battlefield 2042', 'PC', '1200', 'Si'),
('Assassins Creed: Vallhalla', 'PS$', '500', 'No');

