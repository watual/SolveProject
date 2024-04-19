import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        
        String str = br.readLine();
        str = str.toLowerCase();
        int result = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'b' || c == 'c'){
                result += 3;
            }else if(c == 'd' || c == 'e' || c == 'f'){
                result += 4;
            }else if(c == 'g' || c == 'h' || c == 'i'){
                result += 5;
            }else if(c == 'j' || c == 'k' || c == 'l'){
                result += 6;
            }else if(c == 'm' || c == 'n' || c == 'o'){
                result += 7;
            }else if(c == 'p' || c == 'q' || c == 'r' || c == 's'){
                result += 8;
            }else if(c == 't' || c == 'u' || c == 'v'){
                result += 9;
            }else if(c == 'w' || c == 'x' || c == 'y' || c == 'z'){
                result += 10;
            }
        }
        
        bw.write( Integer.toString(result) );
        bw.write("\n");
        bw.close();
    }
}