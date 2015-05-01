package diceApp;

public class d6 implements Dice {
	public int roll(){
		return (int)(Math.random()*6+1);
	}
}
