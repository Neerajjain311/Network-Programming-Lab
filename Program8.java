/* A file urls.txt has a list of various web urls (seperated by white space). Identify the number of these urls. For each URL, identify query string. Also find various parameters (fields) in the query string. Implement this program using string split method. */
import java.util.StringTokenizer;
import java.io.*;
public class Program8 
{
    public static void main(String[] args) throws IOException 
	{
        try {
            FileReader file = new FileReader("C:\\Users\\NJ\\Desktop\\NP Lab\\urls.txt");
            BufferedReader reader = new BufferedReader(file);
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int count = 0;
            while(st.hasMoreTokens())
            {
                count++;
                for(String s: st.nextToken().split("\\?")[1].split("\\&")) 
				{
                    System.out.printf("%s\n", s);
                }
            }
            System.out.printf("Count of urls = %d", count);
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}