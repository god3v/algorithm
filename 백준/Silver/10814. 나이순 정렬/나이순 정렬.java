import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        read N
        list = new ArrayList<member>(N)
        for i in 0..N-1:
            read age, name
            list.add(new member(age, name))

        sort list by (age asc, idx asc)

        bw = new BufferedWriter(..)
        for member in list:
            bw.write(member.age + " " + member.name)
        bw.flush
        bw.close
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>(N);

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            list.add(new Member(age, name, i));
        }

        list.sort(
            Comparator.comparingInt(Member::getAge)
                    .thenComparingInt(Member::getIdx)
        );

        for (Member member: list) {
            bw.write(member.getAge() + " " + member.getName());
            bw.newLine();
        }
        bw.flush();
    }

    static class Member {
        public final int age;
        public final String name;
        public final int idx;

        public Member(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getIdx() {
            return idx;
        }
    }
}
