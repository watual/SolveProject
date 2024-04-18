import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;
        int data = 0, max = 0, max_cnt = 0,count = 1;

        while((str=br.readLine())!=null){
            if(str.isBlank()){
                break;
            }
            data=Integer.parseInt(str);
            if(data > max){
                max = data;
                max_cnt = count;
            }
            count++;
        }
        bw.write(max + "\n" + max_cnt);
        bw.write("\n");
        bw.close();
    }
}