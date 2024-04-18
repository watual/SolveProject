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
        int n = 0, x = 0;

        str = br.readLine();
        st = new StringTokenizer(str, " "); // split기준을 지정하거나, 비워둠으로 /t /n /r /f 등 공백문자를 기준으로 지정한다
        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str);
        int data = 0;
        for (int i = 0; i < n; i++) { // st.countToken(); 을 이용해 개수 측정도 가능
            if (x > (data = Integer.parseInt(st.nextToken()))) {
                bw.write(data + " ");
            }
        }
        bw.write("\n");
        bw.close();
    }
}