import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0;i<n;i++){
            int a = br.read()-'0';
            result += a;
        }
        
        bw.write(result+"");
        bw.write("\n");
        bw.close();
    }
}