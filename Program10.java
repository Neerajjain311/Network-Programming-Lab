/*Write a program that asks the user to input a regular expression and a test string and reports all the substrings of the test string matching the given regular expression along with indices of the substring. */

import java.util.Scanner;
import java.util.regex.*;
public class Program10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regex: ");
        String regex = sc.nextLine();
        System.out.println("Enter string: ");
        String st = sc.nextLine();
        System.out.println("Enter replace: ");
        String rep = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(st);
        st = matcher.replaceAll(rep);
        System.out.println(st);
    }
}