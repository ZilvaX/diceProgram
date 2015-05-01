package diceApp;

public class d8 implements Dice {
	public int roll(){
		return (int)(Math.random()*8+1);
	}
}
