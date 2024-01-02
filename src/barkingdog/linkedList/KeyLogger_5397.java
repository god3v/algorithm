package barkingdog.linkedList;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class KeyLogger_5397 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i=0; i<num; i++) {
            LinkedList<Character> ll = new LinkedList<>();
            ListIterator<Character> iter = ll.listIterator();
            String str = br.readLine();

            for (int j=0; j<str.length(); j++) {
                switch (str.charAt(j)) {
                    case '<' :
                        if (iter.hasPrevious())
                            iter.previous();
                        break;

                    case '>' :
                        if (iter.hasNext())
                            iter.next();
                        break;

                    case '-' :
                        if (iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        break;

                    default :
                        iter.add(str.charAt(j));
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c : ll)
                sb.append(c);
            System.out.println(sb.toString());
        }
    }
}
