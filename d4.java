package diceApp;

public class d4 implements Dice {
	public int roll(){
		return (int)(Math.random()*4+1);
	}
}
