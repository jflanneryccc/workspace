
public class BookArray {

	public static void main(String[] args) {
		Book someBook[] = new Book[10];
		someBook[0] = new Fiction("Trust Nobody and Get Cash");
		someBook[1] = new NonFiction("Introduction to Java");
		someBook[2] = new Fiction("Intelligent Elected Officials");
		someBook[3] = new NonFiction("The Road Not Taken");
		someBook[4] = new Fiction("Honest Political Parties");
		someBook[5] = new NonFiction("Europe on $5 a Day");
		someBook[6] = new Fiction("War and Peace");
		someBook[7] = new Fiction("Roman Dominance 50BC");
		someBook[8] = new Fiction("Disclosure");
		someBook[9] = new Fiction("Unbiased Reporting");
		for(int i =0; i < someBook.length; i++) {
			System.out.println(someBook[i].toString());
		}
	}
}
