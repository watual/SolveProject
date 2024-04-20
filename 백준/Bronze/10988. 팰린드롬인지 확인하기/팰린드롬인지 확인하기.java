import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String result = "1";
        for(int i=0;i<str.length()/2;i++){
            if( str.charAt(i) != str.charAt(str.length()-1-i) ) {
                result = "0";
                break;
            }
        }
        
        bw.write(result);
        bw.write("\n");
        bw.close();
    }
}