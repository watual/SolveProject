
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // 알파벳 대소문자 단어에서 대소문자 구분 없이 어떤 단어가 가장 많이 사용된 알파벳인지 알아내는 프로그램
        // 길이는 최대 100만
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();
        int[] numArr = new int[26];
        int maxNum = 0;
        String result = "?";

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 'A';
            numArr[n]++;
        }

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > maxNum) {
                maxNum = numArr[i];
                char c = (char) (i + 'A');
                result = Character.toString(c);
            } else if (numArr[i] == maxNum) {
                result = "?";
            }
        }
        bw.write(result);

        bw.write("\n");
        bw.close();
    }
}