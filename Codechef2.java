import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    	while(num!=0)
		{
	    int N = sc.nextInt();
	    int X = sc.nextInt();
		int P = sc.nextInt();
	
		if(((X*3)-(N-X))>=P)
		System.out.println("PASS");
		else
		System.out.println("FAIL");
	   num--;
		
		}
	}
}
