-- Create Teachers
INSERT INTO eschooldb.person (id, ucn, date_of_birth, first_name, gender, last_name, phone_number)
VALUES ('550e8400-e29b-41d4-a716-446655440000', '1', '1990-05-02 00:45:59.000000', 'TeacherFN1', 'MALE', 'TeacherLN1', null);

INSERT INTO eschooldb.professor VALUES ('550e8400-e29b-41d4-a716-446655440000');


INSERT INTO eschooldb.person (id, ucn, date_of_birth, first_name, gender, last_name, phone_number)
VALUES ('f47ac10b-58cc-4372-a567-0e02b2c3d479', '2', '1991-03-01 00:45:59.000000', 'TeacherFN2', 'FEMALE', 'TeacherFN2', null);

INSERT INTO eschooldb.professor VALUES ('f47ac10b-58cc-4372-a567-0e02b2c3d479');


INSERT INTO eschooldb.person (id, ucn, date_of_birth, first_name, gender, last_name, phone_number)
VALUES ('38400000-8cf0-11bd-b23e-10b96e4ef00d', '3', '1985-12-04 00:43:59.000000', 'TeacherFN3', 'MALE', 'TeacherFN3', null);

INSERT INTO eschooldb.professor VALUES ('38400000-8cf0-11bd-b23e-10b96e4ef00d');


-- Create Students
INSERT INTO eschooldb.person (id, ucn, date_of_birth, first_name, gender, last_name, phone_number)
VALUES ('71c27ec0-78a0-44c1-b572-98152150772a', '4', '2005-05-05 00:45:59.000000', 'StudentFN1', 'MALE', 'StudentLN1', null);

INSERT INTO eschooldb.student (id, finished_elementary_school, finished_high_school)
VALUES ('71c27ec0-78a0-44c1-b572-98152150772a', false, false);


INSERT INTO eschooldb.person (id, ucn, date_of_birth, first_name, gender, last_name, phone_number)
VALUES ('dc54c86d-db9c-4232-9b60-f3b1859bdcd7', '5', '2006-06-06 00:55:59.000000', 'StudentFN2', 'MALE', 'StudentLN2', null);

INSERT INTO eschooldb.student (id, finished_elementary_school, finished_high_school)
VALUES ('dc54c86d-db9c-4232-9b60-f3b1859bdcd7', false, false);


INSERT INTO eschooldb.person (id, ucn, date_of_birth, first_name, gender, last_name, phone_number)
VALUES ('a9e0e45b-a8ec-4eab-a789-d1cbfe4bc9e8', '6', '2006-07-07 00:55:59.000000', 'StudentFN3', 'MALE', 'StudentLN3', null);

INSERT INTO eschooldb.student (id, finished_elementary_school, finished_high_school)
VALUES ('a9e0e45b-a8ec-4eab-a789-d1cbfe4bc9e8', false, false);


INSERT INTO eschooldb.person (id, ucn, date_of_birth, first_name, gender, last_name, phone_number)
VALUES ('995ee552-0110-4c05-9330-a34c197e6725', '7', '2006-08-08 00:55:59.000000', 'StudentFN3', 'MALE', 'StudentLN3', null);

INSERT INTO eschooldb.student (id, finished_elementary_school, finished_high_school)
VALUES ('995ee552-0110-4c05-9330-a34c197e6725', false, false);


-- Create Schools
INSERT INTO eschooldb.school (id, name, type)
VALUES ('461c5d1b-2710-438b-8375-765f68d16232', 'ElementarySchool1', 'ELEMENTARY');

INSERT INTO eschooldb.school (id, name, type)
VALUES ('fa5d9007-784b-43c5-bbc1-82f5754b1c61', 'HighSchool1', 'HIGH');


-- Create EducationalSpecializations
INSERT INTO eschooldb.educational_specialization (id, duration, name, school_id)
VALUES ('75526e2a-9096-482c-a665-4fe7cd13e463', 'EIGHT', 'ElementaryEducation', '461c5d1b-2710-438b-8375-765f68d16232');

INSERT INTO eschooldb.educational_specialization (id, duration, name, school_id)
VALUES ('93c760c5-a2f6-4571-9308-b165f7c3edfa', 'FOUR', 'System Administrator', 'fa5d9007-784b-43c5-bbc1-82f5754b1c61');


-- Create Syllabi
INSERT INTO eschooldb.syllabus (id, year_of_introduction, year_order, educational_specialization_id)
VALUES ('88ec54bc-dae0-4677-9d48-6281052ea28b', 2021, 1, '93c760c5-a2f6-4571-9308-b165f7c3edfa');

INSERT INTO eschooldb.syllabus (id, year_of_introduction, year_order, educational_specialization_id)
VALUES ('c6831611-4334-4f07-8105-3875b6372f3b', 2022, 2, '93c760c5-a2f6-4571-9308-b165f7c3edfa');

INSERT INTO eschooldb.syllabus (id, year_of_introduction, year_order, educational_specialization_id)
VALUES ('ad92705e-657a-4a5d-ac3b-80379fa990d8', 2023, 3, '93c760c5-a2f6-4571-9308-b165f7c3edfa');

INSERT INTO eschooldb.syllabus (id, year_of_introduction, year_order, educational_specialization_id)
VALUES ('52eae039-02dc-4016-a3fc-e7156147b8bf', 2024, 4, '93c760c5-a2f6-4571-9308-b165f7c3edfa');


-- Create Subjects
INSERT INTO eschooldb.subject (id, name, syllabus_id)
VALUES ('ddb2246e-8b4e-4c9d-9083-83e01648b646', 'Subject1', '88ec54bc-dae0-4677-9d48-6281052ea28b');

INSERT INTO eschooldb.subject (id, name, syllabus_id)
VALUES ('c12c9d81-fb89-47ff-9e76-19b04a66e797', 'Subject2', '88ec54bc-dae0-4677-9d48-6281052ea28b');

INSERT INTO eschooldb.subject (id, name, syllabus_id)
VALUES ('12c72430-bcea-4534-993a-06c5050a4b26', 'Subject3', '88ec54bc-dae0-4677-9d48-6281052ea28b');

INSERT INTO eschooldb.subject (id, name, syllabus_id)
VALUES ('bfb15d85-6f78-4617-87c0-3508c1590f30', 'Subject4', '88ec54bc-dae0-4677-9d48-6281052ea28b');

INSERT INTO eschooldb.subject (id, name, syllabus_id)
VALUES ('05e3e417-7c3b-4bb9-b279-277d36774d98', 'Subject5', '88ec54bc-dae0-4677-9d48-6281052ea28b');

INSERT INTO eschooldb.subject (id, name, syllabus_id)
VALUES ('34dc0653-c366-431d-9bb0-e3e5e2b82917', 'Subject6', '88ec54bc-dae0-4677-9d48-6281052ea28b');

INSERT INTO eschooldb.subject (id, name, syllabus_id)
VALUES ('6ee28e53-ab7b-4093-9000-1407d859a640', 'Subject7', '88ec54bc-dae0-4677-9d48-6281052ea28b');


-- Create Syllabus to Student connection
INSERT INTO eschooldb.student_syllabus (id, syllabus_id, student_id, semester, finalized)
VALUES ('f9fb4134-f012-4b19-9c5b-fafed8fdf069', '88ec54bc-dae0-4677-9d48-6281052ea28b', '71c27ec0-78a0-44c1-b572-98152150772a', 'FIRST', false);

INSERT INTO eschooldb.student_syllabus (id, syllabus_id, student_id, semester, finalized)
VALUES ('f2954b97-6043-4772-b085-f0ff7d2775cb', '88ec54bc-dae0-4677-9d48-6281052ea28b', 'dc54c86d-db9c-4232-9b60-f3b1859bdcd7', 'FIRST', false);

INSERT INTO eschooldb.student_syllabus (id, syllabus_id, student_id, semester, finalized)
VALUES ('053a6f46-92f4-43ed-814b-4842c51538be', 'c6831611-4334-4f07-8105-3875b6372f3b', '71c27ec0-78a0-44c1-b572-98152150772a', 'FIRST', false);

INSERT INTO eschooldb.student_syllabus (id, syllabus_id, student_id, semester, finalized)
VALUES ('770da62f-ae19-4ef2-8e45-32a6d2027fdc', 'c6831611-4334-4f07-8105-3875b6372f3b', 'dc54c86d-db9c-4232-9b60-f3b1859bdcd7', 'FIRST', false);

INSERT INTO eschooldb.student_syllabus (id, syllabus_id, student_id, semester, finalized)
VALUES ('27b57b07-ce76-4c1b-b657-3b80bb22b3d7', 'ad92705e-657a-4a5d-ac3b-80379fa990d8', '71c27ec0-78a0-44c1-b572-98152150772a', 'FIRST', false);

INSERT INTO eschooldb.student_syllabus (id, syllabus_id, student_id, semester, finalized)
VALUES ('7a14c585-492d-488d-af11-cc1dc0b0fe34', 'ad92705e-657a-4a5d-ac3b-80379fa990d8', 'dc54c86d-db9c-4232-9b60-f3b1859bdcd7', 'FIRST', false);

INSERT INTO eschooldb.student_syllabus (id, syllabus_id, student_id, semester, finalized)
VALUES ('a171409a-e3e9-49ac-9a4b-440cdcb13350', '52eae039-02dc-4016-a3fc-e7156147b8bf', '71c27ec0-78a0-44c1-b572-98152150772a', 'FIRST', false);

INSERT INTO eschooldb.student_syllabus (id, syllabus_id, student_id, semester, finalized)
VALUES ('a59749f4-3c15-45a0-89d3-fa93cf98e358', '52eae039-02dc-4016-a3fc-e7156147b8bf', 'dc54c86d-db9c-4232-9b60-f3b1859bdcd7', 'FIRST', false);