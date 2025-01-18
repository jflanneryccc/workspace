
public abstract class Book {
	private String title;
	protected double price;
	public Book(String title) {
		this.title=title;
	}
	public String toString() {
		String out = "";
		out = out + "Title   "+ this.getTitle()+ "\n";
		out = out + "Price   "+ this.getPrice()+ "\n";
		out = out + "******************************\n";
		return out;
		
	}
	
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	
    public abstract void setPrice(double price);
	
	
	
	

}
