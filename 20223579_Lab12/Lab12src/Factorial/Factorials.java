// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//          
// ****************************************************************
package Factorial;
import java.util.Scanner;

public class Factorials
{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	char keepGoing = 'y';

	
    	while (keepGoing == 'y' || keepGoing == 'Y'){
			System.out.print("Enter an integer: ");
			int val = sc.nextInt();
			
			try{
				MathUtils.method(val);
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
	    	}finally {
	    		System.out.print("Another factorial? (y/n) ");
				keepGoing = sc.next().charAt(0);
	    	}
	 }
	sc.close();
	
    }
}
