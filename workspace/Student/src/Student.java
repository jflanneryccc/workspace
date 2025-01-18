
public class Student {
	private int id;
	private double hours;
	private double points;
	private double gpa;
	
	public Student() {
		id=9999;
		hours=3;
		points=12;
	}
	
	public double getGpa() {
		return points/hours;
	}
	public void setId(int ident) {
		id= ident;
	}
	public int getId() {
		return id;
	}
	public void setPoints(double point) {
		points = point;
	}
	public double getPoints() {
		return points;
	}
	public void setHours(double hrs) {
		hours =hrs;
	}
	public double getHours() {
		return hours;
	}

}
