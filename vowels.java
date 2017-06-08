import java.io.*;
import java.util.*;
class vowels 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		char a[]={'a','e','i','o','u'};
		String str=s.next();
		char[] c=str.toCharArray();
		int d=0;
		for(int i=0;i<5;i++)
		{
		    if(c[0]==a[i])
		    {
		        System.out.println("Vowels");
		        d=1;
		    }
		}
		if(d==0)
		System.out.println("Consonent");
	}
}
