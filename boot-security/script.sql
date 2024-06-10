select * from tabs;

create table member (
    seq number primary key,
    username varchar2(50) not null unique,
    password varchar2(100) not null,
    role varchar2(50) not null
);

create sequence seqMember;

select * from member where username='hong';

delete from member;

commit;

select * from member;