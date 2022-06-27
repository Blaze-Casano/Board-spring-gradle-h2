# Board-spring-gradle-h2
게시판 생성 테스트 

//JDBC Port : 8070

//http://localhost:8070/h2-console/ :: h2 DB 설정 주소

//jdbc:h2:file:C:/Workspace/blaze-board/h2data :: DB 저장소

properties 에서 변경
추가 Server.port = 8070


spring 버전이 2.5.7 이상일경우 properties에 패턴 추가.
spring.mvc.pathmatch.matching-strategy=ant_path_matcher

#새로운 환경에서 실행시 테이블 생성 필요
/*
CREATE TABLE tbl_board(
boardId Long auto_increment,
title varchar (30) not null,
content varchar (30) not null,
name varchar (30) not null,
read varchar (30) not null default 0,
primary key(boardId)
);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목1', '내용1', '이름1');
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목2', '내용2', '이름2');
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목3', '내용3', '이름3');
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목4', '내용4', '이름4');
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목5', '내용5', '이름5');
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목6', '내용6', '이름6');
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목7', '내용7', '이름7');
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목8', '내용8', '이름8');
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목9', '내용9', '이름9');
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목10', '내용10', '이름10');
*/

//Create, Read, Update, Delete. (줄여서 CRUD 라고 부른다)

//작성시 /update 으로 직접 접속
