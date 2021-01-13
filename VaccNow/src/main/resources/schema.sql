CREATE TABLE `branch` (
	`branch_id` INT(11) NOT NULL,
	`name` VARCHAR(50) NULL DEFAULT NULL,
	`address` VARCHAR(200) NULL DEFAULT NULL,
	PRIMARY KEY (`branch_id`)
);

CREATE TABLE `vaccine` (
	`vaccine_id` INT(11) NOT NULL,
	`name` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`vaccine_id`)
);

CREATE TABLE `branch_vaccine` (
	`branch_id` INT(11) NOT NULL,
	`vaccine_id` INT(11) NULL DEFAULT NULL
);

CREATE TABLE `branch_timeslots` (
	`slot_id` INT(11) NOT NULL,
	`branch_id` INT(11) NULL DEFAULT NULL,
	`timeslot` VARCHAR(50) NULL DEFAULT NULL,
	`is_occupied` NUMBER(1) NOT NULL,
	PRIMARY KEY (`slot_id`)
);

CREATE TABLE `applied_vaccination` (
    `applied_id` BIGINT AUTO_INCREMENT NOT NULL,
    `branch_id` INT(11) NOT NULL,
    `vaccine_id` INT(11) NOT NULL,
    `timeslot` VARCHAR(50) NULL DEFAULT NULL,
    `user_id` INT(11) NOT NULL,
    `is_confirmed` NUMBER(1) NOT NULL,
    `applied_time` DATE NOT NULL,
     PRIMARY KEY (`applied_id`)
);
