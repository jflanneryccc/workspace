import java.util.Scanner;
// name date purpose
public class Paint {

	public static void main(String[] args) {
		double len, wid, high,wallArea,gallons,cost;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length, width and height separated by a space ");
		len = input.nextDouble();
		wid = input.nextDouble();
		high = input.nextDouble();
		wallArea = calcWallArea(len,wid,high);
		gallons = calcGallons(wallArea);
		System.out.println("Number of gallons needed is "+gallons);
		cost = calcPrice(gallons);
		System.out.println("The price to paint this room is $"+cost);
	}
	private static double calcPrice(double gallons) {
		
		double cost = gallons * 32;
		return cost;
	}

	private static double calcGallons(double wallArea) {
		double gallons = wallArea/350;
		return gallons;
		
	}

	private static double calcWallArea(double len, double wid, double high) {
		double wallArea = (wid*high + len*high)*2;
		return wallArea;
		
	}

}
