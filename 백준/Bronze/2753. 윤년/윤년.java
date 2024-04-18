
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        /*
         && : 좌측값이 true면 우측값 반환, 좌측값이 false면 좌측값 반환
         || : 좌측값이 true면 좌측값 반환, 좌측값이 false면 좌측값 반환
        */
        if ( (x%400==0) || (x%100!=0) && (x%4==0) ) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        scan.close();
    }
}