package com.company;

import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);

    private String title;
    private String dueDate;

    public Game(String title) {
        this.title = title;
        dueDate = "";
    }

    public Game() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


    public void addGame() {
    }
}










