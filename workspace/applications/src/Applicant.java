
public class Applicant {
	private String name;
	private String phone;
	private boolean word;
	private boolean excel;
	private boolean access;
	private boolean graphics;
	public Applicant(String name, String phone, boolean word, boolean excel,
			boolean access, boolean graphics) {
		this.setName(name);
		this.setAccess(access);
		this.setWord(word);
		this.setExcel(excel);
		this.setAccess(access);
		this.setGraphics(graphics);
	}
	public void displayInfo() {
		System.out.println("Name     "+ this.getName());
		System.out.println("Phone    "+ this.getPhone());
		System.out.println("Word     "+ this.isWord());
		System.out.println("Excel    "+ this.isExcel());
		System.out.println("Access   "+ this.isAccess());
		System.out.println("Graphics "+ this.isGraphics());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isWord() {
		return word;
	}
	public void setWord(boolean word) {
		this.word = word;
	}
	public boolean isExcel() {
		return excel;
	}
	public void setExcel(boolean excel) {
		this.excel = excel;
	}
	public boolean isAccess() {
		return access;
	}
	public void setAccess(boolean access) {
		this.access = access;
	}
	public boolean isGraphics() {
		return graphics;
	}
	public void setGraphics(boolean graphics) {
		this.graphics = graphics;
	}

}
