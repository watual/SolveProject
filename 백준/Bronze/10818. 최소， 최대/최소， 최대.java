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
        int n = 0, data = 0, min = 0, max = 0;

        n = Integer.parseInt(br.readLine());

        str = br.readLine();
        st = new StringTokenizer(str, " "); // split기준을 지정하거나, 비워둠으로 /t /n /r /f 등 공백문자를 기준으로 지정한다
        min = max = data = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            data = Integer.parseInt(st.nextToken());
            if (data < min) {
                min = data;
            }
            if (data > max) {
                max = data;
            }
        }
        bw.write(min + " " + max);
        bw.write("\n");
        bw.close();
    }
}