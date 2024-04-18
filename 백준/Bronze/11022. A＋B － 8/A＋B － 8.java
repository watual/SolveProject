import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
            // bw.flush();
        }
        bw.close();
        // ==================================================
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int[] a = new int[n];
        // int[] b = new int[n];
        // for (int i = 0; i < n; i++) {
        // a[i] = s.nextInt();
        // b[i] = s.nextInt();
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " +
        // (a[i] + b[i]));
        // }
    }
}