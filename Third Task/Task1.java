package Task.Third Task;
//Write a JAVA program to find the maximum between three numbers.
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan1.nextInt();
        System.out.println("Enter second number");
        int num2 = scan1.nextInt();
        System.out.println("Enter third number");
        int num3 = scan1.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number");
        } else {
            System.out.println(num3 + " is the largest number");
        }
        scan1.close();
    }
    
}
