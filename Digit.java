import java.util.*;
import java.lang.*;
import java.io.*;
class Digit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			System.out.print(str.charAt(i));
		}
	}
}
