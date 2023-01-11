package com.example.OOP.inheritance.example;

import java.util.ArrayList;
import java.util.List;

public class InheritanceRunner {

    public static void main(String[] args) {

        List<Integer> playerScores = new ArrayList<>();
        playerScores.add(455);
        playerScores.add(333);
        playerScores.add(144);
        playerScores.add(144); // adding 4th score will throw our custom exception - inherited from RuntimeException

        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setScores(playerScores);
    }
}
