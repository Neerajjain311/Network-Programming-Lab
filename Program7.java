/* A file urls.txt has a list of various web urls (seperated by white space). Identify the number of these urls. For each URL, identify query string. Also find various parameters (fields) in the query string. Implement this program using string tokenizer. */
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class stringParsing {
    public static void main(String[] args) throws Exception
    {
        File file = new File("C:\\Users\\NJ\\Desktop\\NP Lab\\urls.txt");
        int tokens = 0, i;
        Scanner sc = new Scanner(file);
        StringTokenizer st1, st2, st3;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            st1 = new StringTokenizer(line," ");
            tokens = st1.countTokens();
            System.out.println("Number of URLs = " + tokens);
            while(st1.hasMoreTokens()){
                i = 0;
                st2 = new StringTokenizer(st1.nextToken(), "?");
                while(st2.hasMoreTokens()){
                    if(i==0){
                        i++;
                        String temp = st2.nextToken();
                        continue;
                    }
                    st3 = new StringTokenizer(st2.nextToken(), "&");
                    while(st3.hasMoreTokens()){
                        System.out.println(st3.nextToken());
                    }
                }
            }
        }
    }
}