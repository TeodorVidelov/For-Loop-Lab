import java.util.Scanner;
public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int n = 1;
        for (int i = 0; i <= number; i += 2) {
            System.out.println(n);
            n = n * 2 * 2;
        }
    }
}