package barkingdog.linkedList;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Editor_1406 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        LinkedList<Character> ll = new LinkedList<>();

        for (int i=0; i<str.length(); i++) {
            ll.add(str.charAt(i));
        }

        ListIterator<Character> iter = ll.listIterator();
        while (iter.hasNext())
            iter.next();

        int idx = ll.size();

        for (int i=0; i<M; i++) {
            String cmd = br.readLine();
            char c = cmd.charAt(0);

            switch (c) {
                case 'L' :
                    if (iter.hasPrevious())
                        iter.previous();
                    break;

                case 'D' :
                    if (iter.hasNext())
                        iter.next();
                    break;

                case 'B' :
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;

                case 'P' :
                    char t = cmd.charAt(2);
                    iter.add(t);
                    break;

                default :
                    break;
            }
        }
            for (char c : ll)
                bw.write(c);

            bw.flush();
            bw.close();
    }
}
