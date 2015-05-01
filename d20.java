package diceApp;

public class d20 implements Test {
	public int roll(){
		return (int)(Math.random()*20+1);
	}
}
