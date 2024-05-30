package com.test.board.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {

    private Long id;
    private String board_Writer;
    private String board_Pass;
    private String board_Title;
    private String board_Contents;
    private int board_Hits;
    private String createAt;

}
