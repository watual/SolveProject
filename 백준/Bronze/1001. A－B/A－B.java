
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int a=0, b=0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        
        System.out.println(a-b);

    }
}