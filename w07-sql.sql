use test;

show databases;
show tables;

create table users(
id varchar(10) primary key,
password varchar(10),
name varchar(20),
role varchar(10)
);

select * from users;

select * from board;

CREATE TABLE CUSTOMER(
ID VARCHAR(10) primary KEY,
PW VARCHAR(10),
NAME VARCHAR(50)
);

DESC CUSTOMER;

SELECT * FROM customer;

create table book(
id varchar(10) primary key,
name varchar(50),
writer varchar(50)
);