import java.io.*;
import java.util.*;
class leap 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%4==0)
		System.out.println("Leap Year");
		else
		System.out.println("Not Leap Year");
	}
}
