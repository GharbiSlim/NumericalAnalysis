package MyIO;
import java.util.Scanner;
public class IO 
{
	static Scanner obj=new Scanner(System.in);
	public static void PO(Object o)
	{
		System.out.println(o);
	}
	public static void P(String s)
	{
		System.out.println(s);
	}
	public static void PSame(String s)
	{
		System.out.println(s);
	}
	public static int I()
	{
		int i=obj.nextInt();
		return i;
	}
	public static float F()
	{
		float f=obj.nextInt();
		return f;
	}
	public static double D()
	{
		double d=obj.nextInt();
		return d;
	}
	public static String S()
	{
		obj.nextLine();
		String s=obj.nextLine();
		return s;
	}
	public static char C()
	{
		char d=' ';
		try
		{
			d=(char)System.in.read();
		}
		catch(Exception e){}
		return d;
	}
	
}