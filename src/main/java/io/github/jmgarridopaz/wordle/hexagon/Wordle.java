package io.github.jmgarridopaz.wordle.hexagon;

public class Wordle implements ForPlaying {

    @Override
    public void newGame() {

    }

    @Override
    public int triesLeft() {
        return 1;
    }

    @Override
    public GuessResult guess(String g) {
        GuessResult result = new GuessResult();
        if ( g.equals(this.theWord()) ) {
            result.setResultString("xxxxx");
        }
        return result;
    }

    @Override
    public String theWord() {
        return "hello";
    }

}
