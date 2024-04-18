import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        int x, y;

        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        s.close();

        System.out.println(x*y);
        
    }
}
