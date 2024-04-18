
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();
        int cook = scan.nextInt();
        int time = 60 * h + m + cook;

        while(time >= 60*24){
            time -= 60*24;
        }
        h = time / 60;
        m = time % 60;

        System.out.println(h + " " + m);

        scan.close();
    }
}