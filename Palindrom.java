import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Close the scanner after reading input
        sc.close();

        int originalNum = num;
        int reversedNum = 0;
        int digit;
        int even_count = 0;
        int odd_count = 0;

        while (num > 0) {
            digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;

            if (digit % 2 == 0) {
                even_count++;
                System.out.println("Even digit: " + digit);
            } else {
                odd_count++;
                System.out.println("Odd digit: " + digit);
            }
        }

        System.out.println("Total even digits: " + even_count);
        System.out.println("Total odd digits: " + odd_count);

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
