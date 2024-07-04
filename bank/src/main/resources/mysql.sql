CREATE TABLE `bank_app`.`accounts` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `acc_type` VARCHAR(10) NOT NULL,
  `rate_of_intrest` DECIMAL(10) NOT NULL,
  `balance` DECIMAL(30) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `US_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `US`
    FOREIGN KEY (`user_id`)
    REFERENCES `bank_app`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);