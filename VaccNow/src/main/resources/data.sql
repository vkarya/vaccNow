INSERT INTO `branch` (`branch_id`, `name`, `address`) VALUES (101, 'New Delhi', 'Laal Kuan');
INSERT INTO `branch` (`branch_id`, `name`, `address`) VALUES (102, 'Ghaziabad', 'Vaishali');

INSERT INTO `vaccine` (`vaccine_id`, `name`) VALUES (1, 'Cov-19');
INSERT INTO `vaccine` (`vaccine_id`, `name`) VALUES (2, 'Fizer-101');

INSERT INTO `branch_vaccine` (`branch_id`, `vaccine_id`) VALUES (101, 1);
INSERT INTO `branch_vaccine` (`branch_id`, `vaccine_id`) VALUES (102, 1);
INSERT INTO `branch_vaccine` (`branch_id`, `vaccine_id`) VALUES (101, 2);
INSERT INTO `branch_vaccine` (`branch_id`, `vaccine_id`) VALUES (102, 2);

INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1001, 101, '10:00AM-10:15AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1002, 101, '10:15AM-10:30AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1003, 101, '10:30AM-10:45AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1004, 101, '10:45AM-11:00AM');

INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1005, 101, '11:00AM-11:15AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1006, 101, '11:15AM-11:30AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1007, 101, '11:30AM-11:45AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1008, 101, '11:45AM-12:00PM');

INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1009, 102, '10:00AM-10:15AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1010, 102, '10:15AM-10:30AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1011, 102, '10:30AM-10:45AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1012, 102, '10:45AM-11:00AM');

INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1013, 102, '11:00AM-11:15AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1014, 102, '11:15AM-11:30AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1015, 102, '11:30AM-11:45AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1016, 102, '11:45AM-12:00PM');

INSERT INTO `applied_vaccination` (`branch_id`,`vaccine_id`, `timeslot`, `user_id`, `is_confirmed`, `applied_time`) VALUES (101, 1, '11:45AM-12:00PM', '111111', true, sysdate-2);
INSERT INTO `applied_vaccination` (`branch_id`,`vaccine_id`, `timeslot`, `user_id`, `is_confirmed`,`applied_time`) VALUES (101, 1, '10:45AM-11:00PM', '111112', false, sysdate);