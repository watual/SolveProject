import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            change(num, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(num[i]) + " ");
        }
        bw.write("\n");
        bw.close();
    }

    private static void change(int[] num, int a, int b) {
        for (int i = 0; i <= (b - a) / 2; i++) {
            int k = num[a + i - 1];
            num[a + i - 1] = num[b - i - 1];
            num[b - i - 1] = k;
        }
    }
}