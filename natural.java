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
		
        int a;
        int sum=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        for(int i = 1; i <=a;++i)
        {
            sum=sum+i;
        }

        System.out.println(" " +sum);
	}
}
