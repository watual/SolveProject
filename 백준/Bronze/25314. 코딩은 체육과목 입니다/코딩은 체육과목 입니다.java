import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 4; i <= n; i = i + 4) {
            System.out.print("long ");
        }
        System.out.println("int");
        scan.close();
    }
}