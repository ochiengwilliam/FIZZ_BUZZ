
import java.util.Scanner;

public class Fundamentals {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
    int number = scanner.nextInt();

        if (number % 5 ==0 && number % 3 == 0)
        System.out.println("fizzbuzz");
        if (number % 5 == 0)
        System.out.println("fizz");
        if (number % 3== 0)
        System.out.println("buzz");
    }
}
