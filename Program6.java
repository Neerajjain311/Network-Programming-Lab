/* Parse the content of a file(.txt) using Scanner class and identifies the number of different primitive datatypes in the given string like int, double, etc and lists these seperately(delimeter is white space).*/
import java.util.Scanner;
import java.io.*;

public class Program6
{
	public static void main(String[] args) throws IOException {
		try {
			FileReader file = new FileReader("C:\\Users\\NJ\\Desktop\\NP Lab\\Input2.txt");
			BufferedReader reader = new BufferedReader(file);
			Scanner sc = new Scanner(reader.readLine());
			int intCount = 0, stringCount = 0, floatCount = 0, boolCount = 0;
			while(sc.hasNext()) {
				if(sc.hasNextInt()) {
					intCount++;
				}
				else if(sc.hasNextDouble()) {
					floatCount++;
				}
				else if(sc.hasNextBoolean()) {
					boolCount++;
				}
				else {
					stringCount++;
				}
				sc.next();
			}
			reader.close();
			sc.close();
			System.out.printf("String Count: %d, Int Count: %d, Float Count: %d, Bool Count: %d", stringCount, intCount, floatCount, boolCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}