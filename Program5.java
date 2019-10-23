/* Parse the content of a file(.txt) using string tokenizer class (delimeter is white space). */

import java.util.StringTokenizer;
import java.io.*;

public class Program5 {
	public static void main(String[] args) throws IOException 
	{
		try 
		{
			FileReader file = new FileReader("C:\\Users\\NJ\\Desktop\\NP Lab\\Input.txt");
			BufferedReader reader = new BufferedReader(file);
			StringTokenizer st = new StringTokenizer(reader.readLine());
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken());
			}
			reader.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
