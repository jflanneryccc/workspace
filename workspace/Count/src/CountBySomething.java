import java.util.Scanner;

public class CountBySomething {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int countBy;int entry =1;
		System.out.print("Enter a number to count by ");
		countBy = input.nextInt();
		
		for( int count = countBy; count <= 500; count=count + countBy) {
			System.out.print(count + " ");
			entry = entry + 1;
			if(entry > 10) {
				System.out.println();
				entry = 1;
			}	
		}
	}
		
}
