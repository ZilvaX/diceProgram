package diceApp;

public class d10 implements Dice {
	public int roll(){
		return (int)(Math.random()*10+1);
	}
}
