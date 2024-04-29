// package Task.Third Task;
//Write a JAVA program to check whether a number is negative, positive, or zero.
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        if (num1 > 0 ) {
            System.out.println("Positive");
        }else if (num1 < 0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
        scan.close();
    }
    
}
