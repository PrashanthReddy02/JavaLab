

package Javalab;

import java.util.Scanner;

public class TwoDigitNumberSum {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a two-digit number: ");

int number = scanner.nextInt();

int sum = calculateDigitSum(number);

while (sum >= 10) {

sum = calculateDigitSum(sum);

}

System.out.println("Sum of digits until the sum is less than 10: " + sum);

}

private static int calculateDigitSum(int number) {

int sum = 0;

int tensDigit = number / 10;

int onesDigit = number % 10;

sum = tensDigit + onesDigit;

return sum;

}

}
