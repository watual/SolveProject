import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String tmp = "";
        int max = 0;
        for(int i=0;i<3;i++){
            tmp += str.charAt(3-1-i);
        }
        max = Integer.parseInt(tmp);
        str = st.nextToken();
        tmp = "";
        for(int i=0;i<3;i++){
            tmp += str.charAt(3-1-i);
        }
        if(max<Integer.parseInt(tmp)){
            max = Integer.parseInt(tmp);
        }
        
        bw.write(max + "\n");
        bw.close();
    }
}