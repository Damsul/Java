package com.example.javaproject2.week7.day30_31.opgame.servie;

public class OpGame {

    int remainingAnswers;
    int a, b;
    String cheeringUpMsg = "한번 더 해보자";

    public OpGame(PlusOperatorLevelOne plusOperatorLevelOne) {
    }

    public void makeQuestion() {
        remainingAnswers = 3;
        a = 1;
        b = 1;
    }
    public void makeQuestion(int max) {
        int a = (int)(Math.random() * max);
        int b = max - 1 - a;
    }

    public String getQuestion() {
        return String.format("%d + %d = ", a, b);
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public boolean inAnswer(int answer) {
        remainingAnswers--;
        return (a + b) == answer;
    }

    public String getCheeringUpMsg() {
        return cheeringUpMsg;
    }
}
