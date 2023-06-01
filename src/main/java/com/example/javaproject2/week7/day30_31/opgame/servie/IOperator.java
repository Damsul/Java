package com.example.javaproject2.week7.day30_31.opgame.servie;

public interface IOperator {
    void setA(int a);
    void setB(int b);
    void generateQuestion(int max);
    String getQuestionMsg();
    boolean isEquals(int answer);
}
