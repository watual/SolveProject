import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        double x, y;

        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();

        System.out.println(x/y);

        s.close();
    }
}
