package com.test.board.controller;

import com.test.board.dto.BoardDTO;
import com.test.board.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String save(BoardDTO boardDTO) {
        //System.out.println("dto = " + dto);

        boardService.save(boardDTO);
        return "index";
    }

    @GetMapping("/list")
    public String list(Model model) {

        List<BoardDTO> boardDTOList = boardService.list();

        model.addAttribute("boardDTOList", boardDTOList);
        System.out.println("boardDTOList: " + boardDTOList);

        return "list";
    }
}
