package io.github.jmgarridopaz.wordle.outside.testcases;

import io.github.jmgarridopaz.wordle.hexagon.ForPlaying;
import io.github.jmgarridopaz.wordle.hexagon.GuessResult;
import io.github.jmgarridopaz.wordle.hexagon.Wordle;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class GameTest {

    @Test
    public void testDefaultNumberOfTriesIsOne() {
        ForPlaying game = new Wordle();
        game.newRound();
        Assert.assertEquals( game.triesLeft(), 1 );
    }

    @Test
    public void testDefaultWordIsHello() {
        ForPlaying game = new Wordle();
        game.newRound();
        Assert.assertEquals( game.theWord(), "hello");
    }

    @Test
    public void testCanCorrectlyGuessTheWord() {
        ForPlaying game = new Wordle();
        game.newRound();
        GuessResult result = game.guess("hello");
        Assert.assertEquals( result.resultString(), "xxxxx" );
    }

}