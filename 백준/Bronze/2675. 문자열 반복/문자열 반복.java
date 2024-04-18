import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int re = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int j=0;j<str.length();j++){
                for(int k=0;k<re;k++){
                    bw.write(str.charAt(j));
                }
            }
            bw.write("\n");
        }

        bw.write("\n");
        bw.close();
    }
}