import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String str = sc.next();
        
        for (char c: str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Character.toUpperCase(c));
            }
            else if (c >= 'A' && c <= 'Z') {
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}