
public class UseBook {

	public static void main(String[] args) {
		Book one = new Fiction("Honest Politicians");
		printStuff(one);
		//System.out.println(one.toString());
		Book two = new NonFiction("Road less taken");
		//System.out.println(two.toString());
		printStuff(two);

	}

	private static void printStuff(Book book) {
		System.out.println(book.toString());
		
	}

}
