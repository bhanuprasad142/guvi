/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
		// your code goes here
		
        int count = 0, a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        while(a!= 0)
        {
            // num = num/10
            a /= 10;
            ++count;
        }

        System.out.println(count);
	}
}
