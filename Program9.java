/* Write a program that asks the user to input a regular expression and a test string and reports all the substrings of the test string matching the given regular expression along with indices of the substring. */
  
import java.util.Scanner;
import java.util.regex.*;
public class Program9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regex: ");
        String regex = sc.nextLine();
        System.out.println("Enter string: ");
        String st = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        int len = 0;
        for(String s: st.split(" ")) {
            Matcher matcher = pattern.matcher(s);
            if(matcher.find()) {
                System.out.printf("%s, %d, %d\n", s, len, len+s.length() - 1);
            }
            len = len + s.length()+1;
        }
    }
}