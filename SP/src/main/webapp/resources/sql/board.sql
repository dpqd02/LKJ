--create user spring identified by java;
--grant resource, connect to spring;
--conn spring/java;

drop table BOARD;
drop sequence BOARD_SEQ;
purge recyclebin;

create table BOARD(
   SEQ number constraint BOARD_PK primary key, 
   WRITER varchar2(10), 
   EMAIL varchar2(20),
   SUBJECT varchar2(20), 
   CONTENT varchar2(20), 
   RDATE date default SYSDATE
); 
create sequence BOARD_SEQ increment by 1 start with 1 nocache;

insert into BOARD values(BOARD_SEQ.nextval, '김인아', 'kim@hanmail.net','제목1', '내용1', SYSDATE);
insert into BOARD values(BOARD_SEQ.nextval, '이빛나', 'lee@hanmail.net','제목2', '내용2', SYSDATE);
insert into BOARD values(BOARD_SEQ.nextval, '한범희', 'han@hanmail.net','제목3', '내용3', SYSDATE);
insert into BOARD values(BOARD_SEQ.nextval, '오현화', 'oh@hanmail.net','제목4', '내용4', SYSDATE);
insert into BOARD values(BOARD_SEQ.nextval, '박참', 'chm@hanmail.net','제목5', '내용5', SYSDATE);

commit;

select CONSTRAINT_NAME, CONSTRAINT_TYPE from user_constraints where TABLE_NAME='BOARD';
select * from BOARD order by SEQ desc;

