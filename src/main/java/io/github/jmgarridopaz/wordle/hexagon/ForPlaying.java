package io.github.jmgarridopaz.wordle.hexagon;

/**
 *	DRIVER PORT
 */
public interface ForPlaying {

	void newGame();

	int triesLeft();

	GuessResult guess ( String g );

	String theWord();
}
