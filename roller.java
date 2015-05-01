package diceApp;

public class roller {
	public static void main(String[] args){
		int diceNumber = Integer.parseInt(args[0]);
		int diceValue;
		if (diceNumber == 20){
			Dice rolled = new d20();
			diceValue = rolled.roll();
		} else if(diceNumber == 12){
			Dice rolled = new d12();
			diceValue = rolled.roll();
		} else if(diceNumber == 10){
			Dice rolled = new d10();
			diceValue = rolled.roll();
		} else if(diceNumber == 8){
			Dice rolled = new d8();
			diceValue = rolled.roll();
		} else if(diceNumber == 6){
			Dice rolled = new d6();
			diceValue = rolled.roll();
		} else if(diceNumber == 4){
			Dice rolled = new d4();
			diceValue = rolled.roll();
		}else {
			System.out.println("Not a valid input");
			return;
		}
		System.out.println(diceValue);
	}
}
