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
        int n = 0, basket = 0;

        st = new StringTokenizer(br.readLine());
        basket = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        int[] balls = new int[basket];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            for (int j = start; j <= end; j++) {
                balls[j-1] = num;
            }
        }

        for (int i = 0; i < basket; i++) {
            bw.write(balls[i] + "");    //버퍼에 쓰이는 데이터는 string으로 나가기 때문에 자료형을 바꿔줘야한다
            if (i < basket - 1) {
                bw.write(" ");
            }
        }
        bw.write("\n");
        bw.close();
    }
}