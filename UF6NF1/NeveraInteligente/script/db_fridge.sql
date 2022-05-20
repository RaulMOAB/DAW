DROP user 'usrfridge'@'localhost';
DROP DATABASE dbfridge;
/*flush privileges;*/
-- Create user for local access.
CREATE USER 'usrfridge'@'localhost' IDENTIFIED BY 'pswfridge';
-- Create database.
CREATE DATABASE dbfridge
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;
-- Grant permissions.
GRANT SELECT, INSERT, UPDATE, DELETE ON dbfridge.* TO 'usrfridge'@'localhost';
-- Use database.
USE dbfridge;
-- Create table 'countries'
CREATE TABLE `fridge_items` (
`id` int(4) NOT NULL auto_increment,
`name` varchar(40) NOT NULL,
`item_type` varchar(40),
`quantity` int default 0,
PRIMARY KEY (`id`)
) ENGINE=InnoDB;
-- Data insertion.
INSERT INTO `fridge_items` (`id`, `name`, `item_type`, `quantity`) 
VALUES
(1, 'Huevos', 'Animal', 12),
(2, 'Leche', 'Animal', 4),
(3, 'Manzana', 'Fruta', 5),
(4, 'Pollo', 'Animal', 2);

