-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema SecretPartner
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SecretPartner
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SecretPartner` DEFAULT CHARACTER SET utf8 ;
USE `SecretPartner` ;

-- -----------------------------------------------------
-- Table `SecretPartner`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SecretPartner`.`roles` (
  `_id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SecretPartner`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SecretPartner`.`users` (
  `_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `rol` INT NOT NULL,
  `username` VARCHAR(15) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  `gender` VARCHAR(45) NULL DEFAULT 'No Especificado',
  PRIMARY KEY (`_id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  INDEX `fk_roles_users_idx` (`rol` ASC) VISIBLE,
  CONSTRAINT `fk_roles_users`
    FOREIGN KEY (`rol`)
    REFERENCES `SecretPartner`.`roles` (`_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SecretPartner`.`raffles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SecretPartner`.`raffles` (
  `_id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(8) NOT NULL,
  `name` VARCHAR(20) NOT NULL,
  `description` TEXT(120) NULL,
  `minValue` FLOAT NOT NULL DEFAULT 0,
  `maxValue` FLOAT NOT NULL DEFAULT 0,
  `participants` INT(5) NOT NULL DEFAULT 2,
  `initDate` DATE NOT NULL,
  `finalDate` DATE NOT NULL,
  PRIMARY KEY (`_id`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SecretPartner`.`tpItems`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SecretPartner`.`tpItems` (
  `_id` INT NOT NULL,
  `description` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SecretPartner`.`items`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SecretPartner`.`items` (
  `_id` INT NOT NULL AUTO_INCREMENT,
  `tpItem` INT NOT NULL,
  `description` VARCHAR(60) NOT NULL,
  `raffleCode` INT NOT NULL,
  PRIMARY KEY (`_id`),
  UNIQUE INDEX `descripcion_UNIQUE` (`description` ASC) VISIBLE,
  INDEX `fk_sorteo_articulo_idx` (`raffleCode` ASC) VISIBLE,
  INDEX `fk_tpArticulo_articulo_idx` (`tpItem` ASC) VISIBLE,
  CONSTRAINT `fk_raffles_items`
    FOREIGN KEY (`raffleCode`)
    REFERENCES `SecretPartner`.`raffles` (`_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tpItems_items`
    FOREIGN KEY (`tpItem`)
    REFERENCES `SecretPartner`.`tpItems` (`_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SecretPartner`.`gifts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SecretPartner`.`gifts` (
  `_id` INT NOT NULL AUTO_INCREMENT,
  `user` INT NOT NULL,
  `items` INT(5) NOT NULL,
  `detalles` TEXT(120) NOT NULL,
  `cantidad` INT(3) NOT NULL DEFAULT 1,
  `trademark` VARCHAR(45) NOT NULL DEFAULT 'Sin Clasificar',
  `material` VARCHAR(20) NULL,
  `type` VARCHAR(20) NULL,
  `size` VARCHAR(10) NULL,
  `color` VARCHAR(20) NULL,
  PRIMARY KEY (`_id`),
  INDEX `fk_articulo_gifts_idx` (`items` ASC) VISIBLE,
  INDEX `fk_users_gifts_idx` (`user` ASC) VISIBLE,
  CONSTRAINT `fk_items_gifts`
    FOREIGN KEY (`items`)
    REFERENCES `SecretPartner`.`items` (`_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_users_gifts`
    FOREIGN KEY (`user`)
    REFERENCES `SecretPartner`.`users` (`_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SecretPartner`.`raffle_users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SecretPartner`.`raffle_users` (
  `_id` INT NOT NULL AUTO_INCREMENT,
  `raffle` INT NOT NULL,
  `user` INT NOT NULL,
  PRIMARY KEY (`_id`),
  INDEX `fk_sorteo_users_idx` (`raffle` ASC) VISIBLE,
  INDEX `fk_users_sorteoUsers_idx` (`user` ASC) VISIBLE,
  CONSTRAINT `fk_raffle_raffleUsers`
    FOREIGN KEY (`raffle`)
    REFERENCES `SecretPartner`.`raffles` (`_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_users_raffleUsers`
    FOREIGN KEY (`user`)
    REFERENCES `SecretPartner`.`users` (`_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SecretPartner`.`ropa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SecretPartner`.`ropa` (
  `_id` INT NOT NULL,
  `talla` VARCHAR(45) NULL,
  `color` VARCHAR(45) NULL,
  `material` VARCHAR(45) NULL,
  PRIMARY KEY (`_id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
