
import java.util.Scanner;

public class FatiasPizza {
    public static void main(String[] args) {
        final int SLICE = 4;

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        System.out.println("quantas pessoas: ");
        int N = scanner.nextInt();
        System.out.println("quantas fatias: ");
        int X = scanner.nextInt();
        int pizza = 0;

        while ((N*X)>pizza){
            pizza += SLICE;
        }
        System.out.println(pizza/4);
    }
}