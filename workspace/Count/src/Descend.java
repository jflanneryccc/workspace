
public class Descend {

	public static void main(String[] args) {
		int a= 2, b=3, c=1, temp;
		
		if(a> b) {
			temp = a;
			a=b;
			b=temp;
		}
		if(b> c) {
			temp = b;
			b=c;
			c=temp;
		}
		if(a> b) {
			temp = a;
			a=b;
			b=temp;
		}
		
		System.out.println(a + " " + b + " " + c);
		
		/*
		 * 
		 *   3  2  2  1
		 *   2  3  1  2
		 *   1  1  3  3
		 * 
		 *    STEPPED AWAY FOR A MINUTE 
		 *    BE RIGHT BACK
		 * 
		 */
		
		
		
		
	}

}
