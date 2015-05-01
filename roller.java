package diceApp;

public class roller {
	public static void main(String[] args){
		int diceNumber = Integer.parseInt(args[0]);
		int diceValue;
		if (diceNumber == 20){
			Dice rolled = new d20();
			diceValue = rolled.roll();
		} else {
			System.out.println("Not a valid input");
			return;
		}
		System.out.println(diceValue);
	}
}
