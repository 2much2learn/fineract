USE `fineract_default`; 

--
-- Dumping data for table `m_code_value`
--

-- Gender
INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'Male', 1
from m_code mc
where mc.`code_name` = "Gender";

INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'Female', 2
from m_code mc
where mc.`code_name` = "Gender";

-- YesNo
INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'Yes', 1
from m_code mc
where mc.`code_name` = "YesNo";

INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'No', 2
from m_code mc
where mc.`code_name` = "YesNo";

--Education
INSERT INTO `m_code`
(`code_name`, `is_system_defined`) 
VALUES 
('Education',1);

INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'Primary', 1
from m_code mc
where mc.`code_name` = "Education";

INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'Secondary', 2
from m_code mc
where mc.`code_name` = "Education";

INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'University', 3
from m_code mc
where mc.`code_name` = "Education";

-- ClientType
INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'General', 1
from m_code mc
where mc.`code_name` = "ClientType";

INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'Special', 2
from m_code mc
where mc.`code_name` = "ClientType";

-- ClientClassification
INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'Married', 1
from m_code mc
where mc.`code_name` = "ClientClassification";

INSERT INTO `m_code_value`(`code_id`,`code_value`,`order_position`)
select mc.id, 'Un Married', 2
from m_code mc
where mc.`code_name` = "ClientClassification";

-- LoanCollateral
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (2, 'car', '', 1, NULL, 1);

-- ClientClosureReason
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (14, 'Out of MFI', '7', 7, NULL, 1);
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (14, 'Inactive', '8', 8, NULL, 1);

-- GroupClosureReason
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (15, 'No Clients under this Group', '1', 1, NULL, 1);
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (15, 'Group desolved', '2', 2, NULL, 1);

-- ClientRejectReason
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (19, 'Invalid applicant', '9', 9, NULL, 1);
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (19, 'Out of Branch', '10', 10, NULL, 1);

-- ClientWithdrawReason
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (20, 'Non Performing MFI', '11', 11, NULL, 1);
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (20, 'Not interested to Join', '12', 12, NULL, 1);

-- CenterClosureReason
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (22, 'Inactive Center', '1', 1, NULL, 1);
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (22, 'Moved Center', '2', 2, NULL, 1);

-- LoanRescheduleReason
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (23, 'personal', 'a', 1, NULL, 1);

-- Constitution
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (24, 'Sydney', '1', 1, NULL, 1);
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (24, 'Melbourne', '1', 1, NULL, 1);

-- Main Business Line
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (25, 'IT Industry', '1', 1, NULL, 1);
INSERT INTO `m_code_value` (`code_id`, `code_value`, `code_description`, `order_position`, `code_score`, `is_active`) VALUES (25, 'Non IT', '2', 2, NULL, 1);

--
-- Dumping data for table `m_office`
--
INSERT INTO `m_office` (`id`, `parent_id`, `hierarchy`, `external_id`, `name`, `opening_date`) VALUES (2, 1, '.2.', NULL, 'Branch Office', '2014-04-01');

--
-- Dumping data for table `m_staff`
--
INSERT INTO `m_staff` (`is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES (1, 1, 'Wilson', 'Nail', 'Nail, Wilson', NULL, NULL, NULL, NULL, 1, NULL, NULL);

INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES (1, 2, 'Joseph', 'D', 'D, Joseph', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES (1, 1, 'Staff', '1', '1, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4524', '4524, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4526', '4526, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4526a', '4526a, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4527', '4527, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4528', '4528, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4529', '4529, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4530', '4530, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4531', '4531, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4532', '4532, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4534', '4534, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4536', '4536, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4537', '4537, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4538', '4538, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4539', '4539, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4540', '4540, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4541', '4541, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4542', '4542, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4543', '4543, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4544', '4544, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4549', '4549, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4551', '4551, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4551a', '4551a, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4552', '4552, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4553', '4553, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4554', '4554, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4555', '4555, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4556', '4556, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4557', '4557, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4559', '4559, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4561', '4561, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4562', '4562, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4563', '4563, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4564', '4564, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4565', '4565, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4566', '4566, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4567', '4567, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4568', '4568, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4569', '4569, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4570', '4570, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4571', '4571, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4572', '4572, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4573', '4573, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4574', '4574, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4575', '4575, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4576', '4576, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4577', '4577, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4578', '4578, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'Staff', '4579', '4579, Staff', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'collectionSheet', '4480', '4480, collectionSheet', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'collectionSheet', '4481', '4481, collectionSheet', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);
INSERT INTO `m_staff` ( `is_loan_officer`, `office_id`, `firstname`, `lastname`, `display_name`, `mobile_no`, `external_id`, `organisational_role_enum`, `organisational_role_parent_staff_id`, `is_active`, `joining_date`, `image_id`) VALUES ( 1, 1, 'collectionSheet', '4482', '4482, collectionSheet', NULL, NULL, NULL, NULL, 1, '2015-01-01', NULL);

--
-- Dumping data for table `acc_gl_account`
--
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (34, 'Penalty to AXIS 2', NULL, '.', '33', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (33, 'Penalty to AXIS 1', NULL, '.', '32', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (32, 'Fees to SBI 2', NULL, '.', '31', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (31, 'Fees to SBI 1', NULL, '.', '30', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (30, 'From Canara', NULL, '.', '29', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (29, 'From HDFC', NULL, '.', '28', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (28, 'Overdraft Interest Income', NULL, '.', '27', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (27, 'Savings income from penalties', NULL, '.', '26', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (26, 'Savings Income from fees', NULL, '.', '25', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (25, 'Savings Writeoff', NULL, '.', '24', 0, 1, 1, 5, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (24, 'Interest On Savings', NULL, '.', '23', 0, 1, 1, 5, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (23, 'Savings Transfer in Suspence', NULL, '.', '22', 0, 1, 1, 2, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (22, 'Saving Control', NULL, '.', '21', 0, 1, 1, 2, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (21, 'Overdraft Portfolio', NULL, '.', '20', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (20, 'Savings Reference', NULL, '.', '19', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (19, '3 Penalty', NULL, '.', '18', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (18, '2 Penalty', NULL, '.', '17', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (17, '1 penalty', NULL, '.', '16', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (16, '3 income', NULL, '.', '15', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (15, '2 Income', NULL, '.', '14', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (14, '1 Income', NULL, '.', '13', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (13, 'Overpayment Liability', NULL, '.', '12', 0, 1, 1, 2, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (12, 'Losses Writtenoff', NULL, '.', '11', 0, 1, 1, 5, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (11, 'Income from recovery repayments', NULL, '.', '10', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (10, 'Income from penalties', NULL, '.', '9', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (8, 'Income from fees', NULL, '.', '8', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (7, 'Income from interest', NULL, '.', '7', 0, 1, 1, 4, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (6, 'Transfer in Suspence', NULL, '.', '6', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (5, 'Penalties Receivable', NULL, '.', '5', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (4, 'Fees Receivable', NULL, '.', '4', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (3, 'Interest Receivable', NULL, '.', '3', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (2, 'Loan portfolio', NULL, '.', '2', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (1, 'Cash', NULL, '.', '1', 0, 1, 1, 1, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (35, 'Liability account -Standard', NULL, '.', '501', 0, 1, 1, 2, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (36, 'Expense account -Standard', NULL, '.', '502', 0, 1, 1, 5, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (37, 'Liability account -SubStandard', NULL, '.', '503', 0, 1, 1, 2, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (38, 'Expense account -SubStandard', NULL, '.', '504', 0, 1, 1, 5, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (39, 'Liability account -Doubtful', NULL, '.', '505', 0, 1, 1, 2, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (40, 'Expense account -Doubtful', NULL, '.', '506', 0, 1, 1, 5, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (41, 'Liability account -Loss', NULL, '.', '507', 0, 1, 1, 2, NULL, NULL);
INSERT INTO `acc_gl_account` (`id`, `name`, `parent_id`, `hierarchy`, `gl_code`, `disabled`, `manual_journal_entries_allowed`, `account_usage`, `classification_enum`, `tag_id`, `description`) VALUES (42, 'Expense account -Loss', NULL, '.', '508', 0, 1, 1, 5, NULL, NULL);

--
-- Dumping data for table `m_charge`
--
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (29, 'TrancheDisbursementCharge-%Disbursementamount', 'USD', 1, 12, 5, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (30, 'TrancheDisbursementCharge-%Interest', 'USD', 1, 12, 4, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (31, 'TrancheDisbursementCharge-%LoanAmount+Interest', 'USD', 1, 12, 3, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (32, 'TrancheDisbursementCharge-%ApprovedAmount', 'USD', 1, 12, 2, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (33, 'TrancheDisbursementCharge-Flat', 'USD', 1, 12, 1, 0, 100.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (34, 'OveerdueFees-%Disbursement amount', 'USD', 1, 9, 5, 0, 1.000000, NULL, NULL, NULL, 1, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (35, 'Installmentfees-%Disbursementamount', 'USD', 1, 8, 5, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (36, 'Specifieddudatefees-%Disbursementamount', 'USD', 1, 2, 5, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (37, 'DisbursementFees-%Disbursementamount', 'USD', 1, 1, 5, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (38, 'OverdueFees-%Interest', 'USD', 1, 9, 4, 0, 1.000000, NULL, NULL, NULL, 1, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (39, 'OveerdueFees-%LoanAmount+Interest', 'USD', 1, 9, 3, 0, 1.000000, NULL, NULL, NULL, 1, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (40, 'OverdueFees-%ApprovedAmount', 'USD', 1, 9, 2, 0, 1.000000, NULL, NULL, NULL, 1, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (41, 'OverdueFees-Flat', 'USD', 1, 9, 1, 0, 100.000000, NULL, NULL, NULL, 1, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (42, 'InstallmentFees-%Interest', 'USD', 1, 8, 4, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (43, 'InstallmentFees-%LoanAmount+Interest', 'USD', 1, 8, 3, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (44, 'InstallmentFees-%ApprovedAmount', 'USD', 1, 8, 2, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (45, 'InstallmentFees-Flat', 'USD', 1, 8, 1, 0, 100.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (46, 'SpecifiedDueDateFees-%Interest', 'USD', 1, 2, 4, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (47, 'SpecifiedDueDateFees-%LoanAmount+Interest', 'USD', 1, 2, 3, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (48, 'SpecifiedDueDateFees-%Approved Amount', 'USD', 1, 2, 2, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (49, 'SpecifiedDueDateFees-Flat', 'USD', 1, 2, 1, 0, 100.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (50, 'DisbursementFees-%Interest', 'USD', 1, 1, 4, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (51, 'DisbursementFees-%LoanAmount+Interest', 'USD', 1, 1, 3, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (52, 'DisbursementFees-%ApprovedAmount', 'USD', 1, 1, 2, 0, 1.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (53, 'DisbursementFees-Flat', 'USD', 1, 1, 1, 0, 100.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (54, 'OVEERDUE Fees-2', 'USD', 1, 9, 1, 0, 100.000000, NULL, 1, NULL, 1, 1, 0, NULL, NULL, 0, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (55, 'SpecifiedDueDatePenalty-Flat', 'USD', 1, 2, 1, 0, 100.000000, NULL, NULL, NULL, 1, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (56, 'OverdueFees-Penalty-Flat', 'USD', 1, 9, 1, 0, 100.000000, NULL, NULL, NULL, 1, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (57, 'InstallmentFees-Penalty-Flat', 'USD', 1, 8, 1, 0, 100.000000, NULL, NULL, NULL, 1, 1, 0, NULL, NULL, NULL, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`) VALUES (58, 'OverdueFees-Penalty-Flat-fre-1', 'USD', 1, 9, 1, 0, 100.000000, NULL, 1, NULL, 1, 1, 0, NULL, NULL, 0, NULL);
INSERT INTO `m_payment_type` (`id`, `value`, `description`, `is_cash_payment`, `order_position`) VALUES (1, 'Wire transfer', '1', 0, 1);
INSERT INTO `m_payment_type` (`id`, `value`, `description`, `is_cash_payment`, `order_position`) VALUES (2, 'Cheque', '2', 0, 2);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`, `tax_group_id`) VALUES (59, 'Client charge-specified due date', 'USD', 3, 2, 1, 0, 100.000000, NULL, NULL, NULL, 0, 1, 0, NULL, NULL, NULL, 8, NULL);
INSERT INTO `m_charge` (`id`, `name`, `currency_code`, `charge_applies_to_enum`, `charge_time_enum`, `charge_calculation_enum`, `charge_payment_mode_enum`, `amount`, `fee_on_day`, `fee_interval`, `fee_on_month`, `is_penalty`, `is_active`, `is_deleted`, `min_cap`, `max_cap`, `fee_frequency`, `income_or_liability_account_id`, `tax_group_id`) VALUES (60, 'Client charge-specified due date-Penalty', 'USD', 3, 2, 1, 0, 100.000000, NULL, NULL, NULL, 1, 1, 0, NULL, NULL, NULL, 11, NULL);

--
-- Dumping data for table `m_floating_rates`
--
INSERT INTO `m_floating_rates` (`id`, `name`, `is_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (1, 'Base Lending Rate', b'1', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');
INSERT INTO `m_floating_rates` (`id`, `name`, `is_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (2, 'Differential Lending Rate', b'0', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');
INSERT INTO `m_floating_rates_periods` (`id`, `floating_rates_id`, `from_date`, `interest_rate`, `is_differential_to_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (1, 1, '2015-04-01 00:00:00', 4.000000, b'0', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');
INSERT INTO `m_floating_rates_periods` (`id`, `floating_rates_id`, `from_date`, `interest_rate`, `is_differential_to_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (2, 1, '2015-03-01 00:00:00', 3.000000, b'0', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');
INSERT INTO `m_floating_rates_periods` (`id`, `floating_rates_id`, `from_date`, `interest_rate`, `is_differential_to_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (3, 1, '2015-02-01 00:00:00', 2.000000, b'0', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');
INSERT INTO `m_floating_rates_periods` (`id`, `floating_rates_id`, `from_date`, `interest_rate`, `is_differential_to_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (4, 1, '2015-01-01 00:00:00', 1.000000, b'0', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');
INSERT INTO `m_floating_rates_periods` (`id`, `floating_rates_id`, `from_date`, `interest_rate`, `is_differential_to_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (5, 2, '2015-04-01 00:00:00', 4.000000, b'1', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');
INSERT INTO `m_floating_rates_periods` (`id`, `floating_rates_id`, `from_date`, `interest_rate`, `is_differential_to_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (6, 2, '2015-03-01 00:00:00', 3.000000, b'1', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');
INSERT INTO `m_floating_rates_periods` (`id`, `floating_rates_id`, `from_date`, `interest_rate`, `is_differential_to_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (7, 2, '2015-02-01 00:00:00', 2.000000, b'1', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');
INSERT INTO `m_floating_rates_periods` (`id`, `floating_rates_id`, `from_date`, `interest_rate`, `is_differential_to_base_lending_rate`, `is_active`, `createdby_id`, `created_date`, `lastmodifiedby_id`, `lastmodified_date`) VALUES (8, 2, '2015-01-01 00:00:00', 1.000000, b'1', b'1', 1, '2015-02-05 00:00:00', 1, '2015-02-05 00:00:00');

--
-- Dumping data for table `m_savings_product`
--
INSERT INTO `m_savings_product` (`id`, `name`, `short_name`, `description`, `deposit_type_enum`, `currency_code`, `currency_digits`, `currency_multiplesof`, `nominal_annual_interest_rate`, `interest_compounding_period_enum`, `interest_posting_period_enum`, `interest_calculation_type_enum`, `interest_calculation_days_in_year_type_enum`, `min_required_opening_balance`, `lockin_period_frequency`, `lockin_period_frequency_enum`, `accounting_type`, `withdrawal_fee_amount`, `withdrawal_fee_type_enum`, `withdrawal_fee_for_transfer`, `allow_overdraft`, `overdraft_limit`, `nominal_annual_interest_rate_overdraft`, `min_overdraft_for_interest_calculation`, `min_required_balance`, `enforce_min_required_balance`, `min_balance_for_interest_calculation`, `withhold_tax`, `tax_group_id`, `is_dormancy_tracking_active`, `days_to_inactive`, `days_to_dormancy`, `days_to_escheat`) VALUES (1, 'Simple Savings', 'SS', 'SS', 100, 'USD', 2, 100, 8.000000, 1, 4, 1, 365, NULL, NULL, NULL, 1, NULL, NULL, 0, 0, 0.000000, 0.000000, 0.000000, 0.000000, 0, NULL, 0, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `acc_gl_financial_activity_account` (`id`, `gl_account_id`, `financial_activity_type`) VALUES (1, 1, 103);
INSERT INTO `acc_gl_financial_activity_account` (`id`, `gl_account_id`, `financial_activity_type`) VALUES (2, 6, 100);

--
-- Dumping data for table `m_savings_product`
--