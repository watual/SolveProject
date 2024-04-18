import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // File fi = new File("D:/1.txt");
        // FileReader fr = new FileReader(fi);
        // BufferedReader br = new BufferedReader(fr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        while (str != null) {
            if (str.isBlank()) {
                break;
            }
            st = new StringTokenizer(str, " ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");

            str = br.readLine();
        }
        bw.close();
    }
}