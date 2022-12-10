package Factorial;
// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//          
// ****************************************************************

public class MathUtils
{
	public static void method(int n) throws IllegalArgumentException{
		if(n < 0)
			System.out.println("The input is smaller than zero.");
		else if(n > 16)
			System.out.println("The input is bigger than sixteen.");
		else
			System.out.println("Factorial(" + n + ") = " + MathUtils.factorial(n));

	}
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n)
    {
	int fac = 1;
	for (int i=n; i>0; i--)
	    fac *= i;
	return fac;
    }


}
