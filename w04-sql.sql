create database TEST;
use TEST;

create table BOARD (
   SEQ int primary key auto_increment,
   TITLE varchar(200),
    WRITER varchar(20),
    CONTENT varchar(2000),
    REGDATE timestamp default current_timestamp,
    CNT int default 0
);

insert into board (title, writer, content) values ('test1', 'user1', 'test1');

desc BOARD;

select * from board;