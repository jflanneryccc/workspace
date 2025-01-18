//intro comment
public class CountByFives {

	public static void main(String[] args) {
		for( int count = 5; count <= 500; count=count + 5) {
			System.out.print(count + " ");
			if(count % 50 == 0)
				System.out.println();
		}
	}

}
