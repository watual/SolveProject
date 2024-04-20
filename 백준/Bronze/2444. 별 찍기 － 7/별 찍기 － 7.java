import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                bw.write(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                bw.write(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.write("\n");
        bw.close();
    }
}

/*
 * 1 2 3 4 5 4 3 2 1 = i
 * 4 3 2 1 0 1 2 3 4 = j공백
 * 1 3 5 7 9 7 5 3 1 = j별
 * 
 * i가 n값보다 커지면 j변화량 변경[j변화량에 대한 변수 추가] > i가 언제 n보다 커지는지조건 매번검사? 흠...
 * 비효율적이군요 > 걍 앞뒤 반복문 2개 만들고 중간에 j변화량 1번 변경
 */