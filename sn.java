/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
		int b,i,s=0;
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
		for(i=0;i<=b;i++)
		{
			s=s+i;
		}
		System.out.println(s);
	}
}
