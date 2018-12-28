drop table PAGING;
drop sequence PAGING_SEQ;
purge recyclebin;

create table PAGING
(
   SEQ  number primary key,
   SUBJECT   varchar2 (1000),
   RDATE   date default SYSDATE
);

create sequence PAGING_SEQ START WITH 0 MINVALUE 0 increment by 1 nocache;

insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'ī1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'Ÿ1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'ī2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'Ÿ2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'��2');
commit;

select * from PAGING order by SEQ desc;