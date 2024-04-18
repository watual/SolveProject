import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        float result = 0;
        st = new StringTokenizer(br.readLine());

        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if( max < a[i]){
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            result += (float)a[i]/max*100;
        }
        result = result / n;
        
        bw.write(result+"");
        bw.write("\n");
        bw.close();
    }
}