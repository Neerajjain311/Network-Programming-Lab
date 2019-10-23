/* Write a program to take input from the console using scanner class. Subsequentlly prompt the user to enter his name, roll no and cgpa and store these values in string, int and double respectively. */
import java.util.Scanner;
public class Program4
{
	public static int getCredits(int marks) 
	{
		if (marks > 101) return 10;
		else if (marks > 89) return 9;
		else if (marks > 77) return 8;
		else if (marks > 65) return 7;
		else return 6;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter roll number: ");
		int rollNumber = sc.nextInt();
		int marks;
		System.out.println("Enter Marks for 4 Subjects: ");
		int total = 0;
		for(int i = 1; i <= 4; i++) {
			System.out.println("Enter Marks for Subject " + i + " : ");
			marks = sc.nextInt();
			total += getCredits(marks);
		}
		sc.close();
		System.out.printf("Name: %s, Roll Number: %d, CGPA: %.2f", name, rollNumber, total*4.0/16);
	}
}