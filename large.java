import java.io.*;
import java.util.*;
class large 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int m=0,n=0;
		while(a>0)
		{
		    n=a%10;
		    if(m<n)
		    {
		        m=n;
		    }
		    a=a/10;
		}
		System.out.println("Largest number is : "+m);
	}
}
