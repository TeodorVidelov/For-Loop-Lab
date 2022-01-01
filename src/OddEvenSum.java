import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < countNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                evenSum += number;
            }
            else {
                oddSum += number;
            }
        }
        if (evenSum == oddSum){
            System.out.printf("Yes Sum = %d",evenSum);
        }
        else {
            System.out.printf("No Diff = %d",Math.abs(evenSum - oddSum));
        }
    }
}