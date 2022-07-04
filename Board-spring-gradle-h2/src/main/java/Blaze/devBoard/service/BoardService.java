package Blaze.devBoard.service;

import Blaze.devBoard.Mapper.BoardMapper;
import Blaze.devBoard.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // 서비스 역할을 하는 것임을 명시
@RequiredArgsConstructor // Mapper 생성자를 사용할 수 있게 함
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;

    public int boardCount() {
        return boardMapper.boardCount(); // 게시글 수 반환
    }

    public List<Board> boardList() {
        return boardMapper.getList(); // 게시글 리스트 반환
    }

    public Board getBoard(Long boardId) {
        return boardMapper.getBoard(boardId); //PK가 boardID인 게시글의 내용을 반환
    }

    @Transactional 
    public void uploadBoard(Board board) {
        boardMapper.uploadBoard(board);
    }

    @Transactional
    public void updateBoard(Board board) {
    // boardMapper.updateBoard(board);
    boardMapper.updateBoard(board);
    }

    @Transactional
    public void deleteBoard(Long boardId) {
        boardMapper.deleteBoard(boardId);
    }
    
    @Transactional
    public void viewCount(Long boardId) {
        boardMapper.viewCount(boardId);
    }

}