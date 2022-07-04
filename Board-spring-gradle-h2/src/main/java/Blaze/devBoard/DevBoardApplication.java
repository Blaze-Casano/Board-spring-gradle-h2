package Blaze.devBoard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages="Blaze.devBoard")
public class DevBoardApplication {

	public static void main(String[] args) {

		SpringApplication.run(DevBoardApplication.class, args);

	}
}

//새로운 환경에서 실행시 테이블 생성 필요
//테이블 자동생성 가능, 그러나 로컬 저장 이유로 빼버림.
/*
CREATE TABLE tbl_board(
boardId Long auto_increment,
title varchar (30) not null,
content varchar (30) not null,
name varchar (30) not null,
read varchar (30) not null default 0,
primary key(boardId)
);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목1', '내용1', '이름1', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목2', '내용2', '이름2', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목3', '내용3', '이름3', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목4', '내용4', '이름4', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목5', '내용5', '이름5', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목6', '내용6', '이름6', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목7', '내용7', '이름7', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목8', '내용8', '이름8', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목9', '내용9', '이름9', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('제목10', '내용10', '이름10', 0);
*/

//Create, Read, Update, Delete. (줄여서 CRUD 라고 부른다)

//작성시 /update 으로 직접 접속