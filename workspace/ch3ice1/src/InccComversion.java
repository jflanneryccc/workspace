import java.util.Scanner;
// J Flannery 1/19  in class 1 ch 3
public class InccComversion {

	public static void main(String[] args) {
		double inches;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of inches ");
		inches = input.nextDouble();
		calcFeet(inches);
		calcYards(inches);

	}

	private static void calcYards(double inches) {
		double yards;
		yards = inches / 36;
		System.out.println(inches + " inches equal "+ yards +" yards");
	}

	/*private static void calcYards(double inches) {
		double yards;
		yards = inches / 36;
		System.out.println(inches + " inches equal "+ yards +" yards");
	}*/

	public static void calcFeet(double inches) {
		double feet;
		feet = inches/ 12;
		System.out.println(inches + " inches equal "+ feet +" feet");
	}

}
