CREATE TABLE Student
(
  student_id CHAR(10) PRIMARY KEY NOT NULL,
  student_num CHAR(18) NOT NULL
);
CREATE UNIQUE INDEX Student_student_id_uindex ON Student (student_id);
CREATE UNIQUE INDEX Student_student_num_uindex ON Student (student_num);
CREATE TABLE User
(
  id CHAR(10) PRIMARY KEY NOT NULL,
  password VARCHAR(25) NOT NULL
);
CREATE UNIQUE INDEX User_id_uindex ON User (id);

