package com.example.javaproject2.week5.day22;

import java.util.EmptyStackException;

public class Stack1 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[--pointer];
    }

    public int peek() {
        return arr[pointer - 1];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
