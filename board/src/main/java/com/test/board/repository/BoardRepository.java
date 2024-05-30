package com.test.board.repository;

import com.test.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final SqlSessionTemplate sql;

    public void save(BoardDTO boardDTO) {
        sql.insert("board.save", boardDTO);
    }

    public List<BoardDTO> list() {

        System.out.println(sql.selectList("board.list"));
        return sql.selectList("board.list");

    }
}
