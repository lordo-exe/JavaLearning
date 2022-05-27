package com.company;

public class Main {

    public static void main(String[] args) {

        String username = "Keril";
        int score = 1001;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(username, position);
    }

    public static void displayHighScorePosition (String username, int position ) {
    System.out.println(username + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500) {
            return 2;
        } else if (score > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
