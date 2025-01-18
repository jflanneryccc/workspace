// name date purpose
public class TestJobApplicants {

	public static void main(String[] args) {
		Applicant one = new Applicant("Juan","34343",true,true,false,true);
		if(shouldInterview(one)) {
			System.out.println(one.getName() + " is to be interviewed");
		}
		Applicant two = new Applicant("Anja", "89889",true, false,false,false);
		if(shouldInterview(two)) {
			System.out.println(one.getName() + " is to be interviewed");
		}
	}
	private static boolean shouldInterview(Applicant app) {
		int counter=0;
		if(app.isGraphics())
			counter++;  // counter = counter + 1
		if(app.isWord())
			counter++;
		if(app.isExcel())
			counter++;
		if(app.isAccess())
			counter++;
		if(counter >= 3)
			return true;
		return false;
	}

}
