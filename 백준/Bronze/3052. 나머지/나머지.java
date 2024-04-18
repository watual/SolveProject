import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0, result=1;
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(br.readLine()) % 42;
            count=0;
            for (int j = 0; j < i; j++) {
                if (num[i] != num[j]) {
                    count++;
                }
                if(count>=i){
                    result++;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.write("\n");
        bw.close();
    }
}