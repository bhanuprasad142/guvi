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
		
      int x, y, z;
      Scanner in = new Scanner(System.in);
      
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
      if ( x > y && x > z )
         System.out.println(x);
      else if ( y > x && y > z )
         System.out.println(y);
      else if ( z > x && z > y )
         System.out.println(z);
      else   
         System.out.println("Entered numbers are not distinct.");
	}
}
