package lab03_20223579;
import java.util.*;

class BasicIO {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		System.out.println("your name is " + name);
		Scanner stdin2 = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
	    int year = stdin2.nextInt();
		System.out.println("your age is " + year);
		System.out.println(year*365);
		
		Scanner stdin3 = new Scanner(System.in);
		System.out.print("Enter your height: ");
		int height = stdin3.nextInt();
		System.out.println("your height is " + height + "cm");
		// display formated output on console
	      System.out.printf("%1$tYy %1$tmm %1$ted today %2$s(%3$d)'s height is %4$d cm.",
	          new Date(), name, year, height);
		
	} // method main
} // class BASIC_IO
