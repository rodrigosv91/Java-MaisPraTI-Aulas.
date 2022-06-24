package com.butunclebob.tdd_bowlinggame_kata;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void shouldScoreGutterGame() {
        rollMany(20, 0);
        //assertThat(bowlingGame.getScore(), is(0)); // deprecated
        Assertions.assertEquals(0, bowlingGame.getScore());       
    }

    @Test
    public void shouldScoreAllOnes() {
        rollMany(20, 1);
        //
        Assertions.assertEquals(20, bowlingGame.getScore());
    }

    @Test
    public void shouldScoreOneSpare() {
        rollSpare();
        bowlingGame.roll(3);
        rollMany(17, 0);

        Assertions.assertEquals(16, bowlingGame.getScore());
    }
    
    @Test
    public void shouldScoreOneStrike() {
        rollStrike();
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        rollMany(16, 0);

        Assertions.assertEquals(24, bowlingGame.getScore());
    }

    @Test
    public void shouldScorePerfectGame() {
        rollMany(12, 10);

        Assertions.assertEquals(300, bowlingGame.getScore());
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++)
            bowlingGame.roll(pins);
    }

    private void rollStrike() {
        bowlingGame.roll(10);
    }
    
    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }  
}