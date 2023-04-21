package com.example.javaproject2.week1.day5;

public class SpaceInvaderMemberVariable {

    int location; // 멤버 변수

    private void moveLeft() {
        location = location - 1;
        System.out.println("moveLeft: " + location);
    }

    private void moveRight() {
        location = location + 1;
        System.out.println("moveRight: " + location);
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        System.out.printf("최종 위치: %d", simv.location);
    }


}
