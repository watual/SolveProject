import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = str.length();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            arr[str.charAt(n - 1 - i) - 'a'] = n-1-i;
        }
        for (int i = 0; i < 26; i++) {
            bw.write(arr[i] + " ");
        }
        bw.write("\n");
        bw.close();
    }
}