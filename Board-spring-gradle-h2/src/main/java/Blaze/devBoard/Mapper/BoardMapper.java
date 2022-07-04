package Blaze.devBoard.Mapper;

import Blaze.devBoard.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

//board 객체로 포장

@Repository
public interface BoardMapper {

    int boardCount(); // sql 문의 id 와 메서드가 같음.

    List<Board> getList();

    Board getBoard(Long boardId);

    void uploadBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(Long boardId);
    
    void viewCount(Long boardId);
}

//주의! Mapper.xml과 상대 경로가 같아야함.