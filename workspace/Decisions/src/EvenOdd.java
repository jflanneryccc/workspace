import java.util.Scanner;
import javax.swing.JOptionPane;

// name date purpose
public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Enter an integer ");
		number = input.nextInt();
		if (number % 2 == 0) {
			JOptionPane.showMessageDialog(null, "The number is even ");
		} else {
			JOptionPane.showMessageDialog(null, "The number is odd ");
		}
	}
}
