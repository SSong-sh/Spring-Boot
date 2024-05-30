package com.test.board.service;

import com.test.board.dto.BoardDTO;
import com.test.board.repository.BoardRepository;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {

        boardRepository.save(boardDTO);
    }

    public List<BoardDTO> list() {
        System.out.println(boardRepository.list());
        return boardRepository.list();

    }

}
