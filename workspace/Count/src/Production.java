
public class Production {

	public static void main(String[] args) {
		double parts=4000; int month;boolean raise = false;
		System.out.println("Month"+ "   "+ "Parts");
		for( month = 1; month<=24; month++) {
			System.out.println(month+ "       "+ parts);
			if(parts >= 7000  && raise == false) {
				System.out.println("Worker gets a raise ");
				raise=true;
			}
			parts = (int)(parts * 1.06);
		}
	}

}
