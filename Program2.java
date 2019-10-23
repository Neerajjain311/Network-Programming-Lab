/* Write a program that parses a given string using split method of the string class (delimeter is underscore). */

public class Program2
{
	public static void main(String args[])
	{
		String s = new String("Hustle_and_Peace");
		for(String str: s.split("_"))
		{
			System.out.println(str);
		}
	}
}