import java.util.Scanner;
public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int rightSum = 0;
        int leftSum = 0;
        for (int i = 1; i <= countNumbers * 2; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (countNumbers < i){
                leftSum += numbers;
            }
            else {
                rightSum += numbers;
            }
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }
        else {
            System.out.printf("No, diff = %d",Math.abs(leftSum - rightSum));
        }
    }
}