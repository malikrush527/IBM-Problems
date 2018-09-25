import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        int a=s1.length();
        int b=s2.length();
        int c=0;
    //    int k=0;
        String result= "NO";
        //System.out.println("check "+c);
        for(int i=0;i<a;i++) {
            for(int k=0;k<b;k++) {
            //    System.out.println(i);
                if (s1.charAt(i)==s2.charAt(k)) {
                    result="YES";
                    break;
                    //result+=s1.charAt(k);
                    //System.out.println(k);
            }

            }

        }
        //System.out.println("checker");
        return result;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
