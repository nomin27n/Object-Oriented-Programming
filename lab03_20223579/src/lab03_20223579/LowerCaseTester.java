package lab03_20223579;

public class LowerCaseTester {
	public static void main(String[] args) {
		String testString = "This is a Test";
		String smallTestString = testString.toLowerCase();
		System.out.println(smallTestString);
		
		String bigTestString = smallTestString.toUpperCase();
		System.out.println(bigTestString);
		
	}

}
