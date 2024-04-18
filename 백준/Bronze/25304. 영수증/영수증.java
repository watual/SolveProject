import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int count = scan.nextInt();
        int cal = 0;
        for (int i = 0; i < count; i++) {
            cal += scan.nextInt() * scan.nextInt();
        }
        if (total == cal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}