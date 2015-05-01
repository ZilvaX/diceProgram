package diceApp;

public class d12 implements Dice {
	public int roll(){
		return (int)(Math.random()*12+1);
	}
}
