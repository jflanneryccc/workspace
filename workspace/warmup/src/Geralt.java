import java.util.Scanner;

// intro comment name date purpse
public class Geralt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int spirits;
		int potions;
		int remainderSprits;
		final int SPIRITS_PER_POTION = 5;
		System.out.print("Enter the number of spirits ");
		spirits = input.nextInt();
		potions = spirits/SPIRITS_PER_POTION;
		remainderSprits=spirits%SPIRITS_PER_POTION;
		System.out.println("With "+spirits +" parts of Dwarven Spirit you "
				+ "can make "+potions+" vials of potion and"
				+ " have a remainder of "+remainderSprits+" parts of Dwarven.");
	}

}
