DROP TABLE IF EXISTS `product_type`;

CREATE TABLE `product_type` (
  `id` INT AUTO_INCREMENT  PRIMARY KEY,
  `type` VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS `property_category`;

CREATE TABLE `property_category` (
  `id` INT AUTO_INCREMENT  PRIMARY KEY,
  `category` VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS `property`;

CREATE TABLE `property` (
  `id` INT AUTO_INCREMENT  PRIMARY KEY,
  `prop_Cat_Id` INT NOT NULL,
  `property` VARCHAR(255) NOT NULL
) ;

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` INT AUTO_INCREMENT  PRIMARY KEY,
  `type` INT NOT NULL,
  `properties` INT NOT NULL,
  `price` DOUBLE,
  `STORED_ADDRESS` VARCHAR(500) NOT NULL
);








