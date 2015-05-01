package diceApp;

public class d20 implements Dice {
	public int roll(){
		return (int)(Math.random()*20+1);
	}
}
