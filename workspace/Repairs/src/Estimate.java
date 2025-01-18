import java.util.Scanner;

//intro comment
public class Estimate {

	public static void main(String[] args) {
		double materials;
		double workHours;
		double travelHours;
		String jobName;
		double estimate;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter job name ");
		jobName = input.nextLine();
		System.out.print("Enter materials cost  ");
		materials = input.nextDouble();
		System.out.print("Enter work hours to complete job   ");
		workHours = input.nextDouble();
		System.out.print("Enter number of travel hours  ");
		travelHours = input.nextDouble();
		estimate = estimateJob(materials, workHours,travelHours);
		System.out.println("The price for "+jobName+ " is $"+ estimate);
		
	}
	
	public static double estimateJob(double materials, double workHours,
			                         double travelHours) {
		double price= materials + workHours*35. + travelHours * 12.;
		
		return price;
		
	}
}


