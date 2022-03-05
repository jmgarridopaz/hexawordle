package io.github.jmgarridopaz.wordle.hexagon;

/**
 *	DRIVER PORT
 */
public interface ForPlaying {

	public void newRound();

	public int triesLeft();

	public GuessResult guess ( String g );

	public  String theWord();
}
