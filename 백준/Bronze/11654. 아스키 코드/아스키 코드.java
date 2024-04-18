import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char n = br.readLine().charAt(0);

        int num = n;

        bw.write(num+"");
        bw.write("\n");
        bw.close();
    }
}