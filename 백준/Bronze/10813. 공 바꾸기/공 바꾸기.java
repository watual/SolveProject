import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int ball = 0, line = 0;

        st = new StringTokenizer(br.readLine());
        ball = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());

        int[] balls = new int[ball];

        for (int i = 0; i < ball; i++) {
            balls[i] = i + 1;
        }

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int change1 = Integer.parseInt(st.nextToken());
            int change2 = Integer.parseInt(st.nextToken());
            int tmp = balls[change1 - 1];
            balls[change1 - 1] = balls[change2 - 1];
            balls[change2 - 1] = tmp;
        }

        for (int i = 0; i < ball; i++) {
            bw.write(balls[i] + " ");
        }
        bw.write("\n");
        bw.close();
    }
}