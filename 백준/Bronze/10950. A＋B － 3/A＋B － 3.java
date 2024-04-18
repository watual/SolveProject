import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Integer> lista = new ArrayList<Integer>(n);
        ArrayList<Integer> listb = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            lista.add(scan.nextInt());
            listb.add(scan.nextInt());

        }
        for (int i = 0; i < n; i++) {
            System.out.println(lista.get(i) + listb.get(i));
        }
        scan.close();
    }
}