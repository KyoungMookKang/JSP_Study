-- New script in localhost.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\workspace\multi\03_DB
-- Date: 2024. 5. 3.
-- Time: 오후 5:04:54

create user computer identified by 1234;

grant connect, resource, dba TO computer;

-----------------------------------------

CREATE USER mouse IDENTIFIED BY 1111;

GRANT CONNECT, resource TO mouse;

-----------------------------------------

CREATE USER keyboard IDENTIFIED BY 1234;

-----------------------------------------

REVOKE resource FROM computer;

CREATE TABLE NOTHIG
(
  NAME  VARCHAR2(100),
  AGE   VARCHAR2(100)
  
);

DROP USER computer CASCADE;

DROP USER mouse CASCADE;

