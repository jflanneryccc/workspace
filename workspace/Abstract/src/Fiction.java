
public class Fiction extends Book {

	public Fiction(String title) {
		super(title);
		this.setPrice(24.99);
	}

	@Override
	public void setPrice(double price) {
		this.price=price;

	}

}
