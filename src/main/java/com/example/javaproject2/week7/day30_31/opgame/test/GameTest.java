package com.example.javaproject2.week7.day30_31.opgame.test;

import static org.junit.jupiter.api.Assertions.*;

import com.example.javaproject2.week7.day30_31.opgame.servie.OpGame;
import com.example.javaproject2.week7.day30_31.opgame.servie.PlusOperatorLevelOne;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void test() {
        OpGame game = new OpGame(new PlusOperatorLevelOne());
        game.makeQuestion();
        String question = game.getQuestion();

        assertEquals("1 + 1 = ", question);
        assertEquals(3, game.getRemainingAnswers());
        assertEquals(false, game.inAnswer(3));
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한번 더 해보자", game.getCheeringUpMsg());
        assertEquals(true, game.inAnswer(2));
    }

    @Test
    public void testRandom() {
        System.out.println((int)(Math.random() * 10));
    }

    @Test
    public void testSumMax() {
        int max = 10;
        int a = (int)(Math.random() * max);
        int b = max - 1 - a;
        assertTrue(a + b < max);
    }
}
