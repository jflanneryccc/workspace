
public class NonFiction extends Book {

	public NonFiction(String title) {
		super(title);
		this.setPrice(37.99);
	}

	@Override
	public void setPrice(double price) {
		this.price = price;

	}

}
