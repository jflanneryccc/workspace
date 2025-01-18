
public class Participant {
	private String name;
	private int age;
	private String address;
	public Participant(String name, int age , String address) {
		this.setName(name);
		this.setAddress(address);
		this.setAge(age);
	}
	public String toString() {
		String out="";
		out=out + "Name       "+ this.getName()+ "\n";
		out=out + "Age        "+ this.getAge()+ "\n";
		out=out + "Address    "+ this.getAddress()+ "\n";
		out= out +"******************************\n";
		return out;
	}
	
	public boolean equals(Participant two) {
		boolean eq=false;
		if(this.name.equals(two.getName())) {
			if(this.age == two.getAge()) {
				if(this.address.equals(two.getAddress()))
					eq = true;
			}
		}
		return eq;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
