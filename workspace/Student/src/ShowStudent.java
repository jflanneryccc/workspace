// name date purpose
public class ShowStudent {

	public static void main(String[] args) {
		Student juan = new Student();
		juan.setId(123);
		juan.setHours(6);
		juan.setPoints(24);
		System.out.println("Id      " + juan.getId());
		System.out.println("Hours   " + juan.getHours());
		System.out.println("Points  " + juan.getPoints());
		System.out.println("GPA     " + juan.getGpa());
		System.out.println("*******************");
		Student molly = new Student();
		System.out.println("Id      " + molly.getId());
		System.out.println("Hours   " + molly.getHours());
		System.out.println("Points  " + molly.getPoints());
		System.out.println("GPA     " + molly.getGpa());
	
	}
}
