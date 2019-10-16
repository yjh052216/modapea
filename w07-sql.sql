use test;

show tables;

create table users(
id varchar(10) primary key,
password varchar(10),
name varchar(20),
role varchar(10)
);

select * from users;
