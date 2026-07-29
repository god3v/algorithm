import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            bw.write(str.charAt(i) + "\n");
        }
        bw.flush();
        sc.close();
    }
}