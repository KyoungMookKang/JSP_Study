-- New script in localhost 2.
-- Connection Type: dev 
-- Url: jdbc:mysql://localhost:3306/
-- workspace : C:\workspace\multi\03_DB
-- Date: 2024. 5. 10.
-- Time: 오전 11:01:06

USE scott;

DROP TABLE MEMBER;
CREATE TABLE member(
	no INT AUTO_INCREMENT PRIMARY KEY,
	id varchar(10),
	pw varchar(10),
	name varchar(10),
	tel varchar(10),
	create_date timestamp

);


INSERT INTO MEMBER
VALUES(NULL,'m01', '1', '리사', '010',NOW());


COMMIT;

SELECT * FROM MEMBER;