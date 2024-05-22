-- New script in localhost 10.
-- Connection Type: dev 
-- Url: jdbc:mysql://localhost:3306/
-- workspace : C:\workspace\multi\03_DB
-- Date: 2024. 5. 21.
-- Time: 오후 3:19:12

CREATE DATABASE jsp;

use jsp;
create table member (
    id varchar(100) NULL,
    name varchar(256) NULL,
    email varchar(100) NULL,
    address varchar(500) NULL
);



SELECT * FROM MEMBER;