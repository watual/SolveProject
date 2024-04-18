import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int index = 0;
        int[] no = new int[2];
        int[] student = new int[30];

        for (int i = 0; i < 28; i++) {
            student[Integer.parseInt(br.readLine()) - 1] = 1;
        }
        for (int i = 0; i < 30; i++) {
            if (student[i] < 1) {
                no[index] = i+1;
                index++;
            }
        }
        bw.write(String.valueOf(no[0]) + "\n" + String.valueOf(no[1]));
        bw.write("\n");
        bw.close();
    }
}