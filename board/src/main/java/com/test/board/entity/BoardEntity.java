package com.test.board.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "board_jpa_new")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String boardWriter;

    @Column
    private String boardTitle;
}
