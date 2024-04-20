import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int[] answer = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<answer.length; i++){
            bw.write( (answer[i] - Integer.parseInt(st.nextToken())) + " ");
        }
        bw.write("\n");
        bw.close();
    }
}