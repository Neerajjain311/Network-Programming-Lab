/* Write a program that parses given string using string tokenizer class and list all the tokens (delimeter is white space). */

import java.util.StringTokenizer;
public class Program1
{
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer("Hustle and Peace", " ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}