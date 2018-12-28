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

insert into BOARD values(BOARD_SEQ.nextval, '���ξ�', 'kim@hanmail.net','����1', '����1', SYSDATE);
insert into BOARD values(BOARD_SEQ.nextval, '�̺���', 'lee@hanmail.net','����2', '����2', SYSDATE);
insert into BOARD values(BOARD_SEQ.nextval, '�ѹ���', 'han@hanmail.net','����3', '����3', SYSDATE);
insert into BOARD values(BOARD_SEQ.nextval, '����ȭ', 'oh@hanmail.net','����4', '����4', SYSDATE);
insert into BOARD values(BOARD_SEQ.nextval, '����', 'chm@hanmail.net','����5', '����5', SYSDATE);

commit;

select CONSTRAINT_NAME, CONSTRAINT_TYPE from user_constraints where TABLE_NAME='BOARD';
select * from BOARD order by SEQ desc;

