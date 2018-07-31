/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
		int num;

        Scanner reader = new Scanner(System.in);
        num = reader.nextInt();
        if(num>0)
        {
        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
	    }
	    else
	    {
	    	System.out.println("invalid");
	    }
}
}
