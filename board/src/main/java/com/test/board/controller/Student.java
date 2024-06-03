package com.test.board.controller;


public class Student {




   private final static Student student = new Student();


    private Student(){

    }

    public Student getInstance(){
            return student;
    }




}
