import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        while (str != null && !str.equals("")) {
            bw.write(str);
            bw.write("\n");
            str = br.readLine();
        }
        bw.close();
    }
}