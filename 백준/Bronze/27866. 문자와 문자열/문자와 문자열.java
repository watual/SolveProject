import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st;

        String x = br.readLine();
        int y = Integer.parseInt(br.readLine());

        bw.write(x.substring(y-1, y));
        bw.write("\n");
        bw.close();
    }
}