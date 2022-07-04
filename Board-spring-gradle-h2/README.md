# Board-spring-gradle-h2
게시판 생성 테스트 

http://localhost:8070/board/main

JDBC Port : 8070

http://localhost:8070/h2-console/ :: h2 DB 설정 주소

jdbc:h2:file:C:/Workspace/blaze-board/h2data :: DB 저장소

properties 에서 변경
추가 Server.port = 8070


spring 버전이 2.5.7 이상일경우 properties에 패턴 추가.
spring.mvc.pathmatch.matching-strategy=ant_path_matcher

### 새로운 환경에서 실행시 테이블 생성 필요


CREATE TABLE tbl_board(
boardId Long auto_increment,
title varchar (30) not null,
content varchar (30) not null,
name varchar (30) not null,
read varchar (30) not null default 0,
primary key(boardId)
);


//Create, Read, Update, Delete. CRUD 구현

//작성시 /update 으로 직접 접속



# Spring boot-security-JPA :: "register&login"
Spring Security에서 Password Storage 를 활용, 자동로그인 구현 및 JPA 리포지토리 에 대해 공부




# Spring boot-mysql-vuejs :: Product CRUD
vue.js 의 CRUD 활용예에 대해 공부
