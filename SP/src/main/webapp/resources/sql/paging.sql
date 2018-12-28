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

insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'가1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'나1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'다1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'라1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'마1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'바1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'사1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'아1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'자1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'차1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'카1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'타1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'파1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'하1');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'가2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'나2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'다2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'라2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'마2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'바2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'사2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'아2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'자2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'차2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'카2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'타2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'파2');
insert into PAGING(seq,subject) values(PAGING_SEQ.nextval,'하2');
commit;

select * from PAGING order by SEQ desc;