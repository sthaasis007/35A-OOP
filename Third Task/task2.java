package Task.Third Task;
//Write a JAVA program to check whether a number is negative, positive, or zero.
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        System.out.println("Enter scecond number");
        int num2 = scan.nextInt();
        System.out.println("Enter third number");
        int num3 = scan.nextInt();
        if (num1 > 0 && num2 > 0 && num3 > 0){
            System.out.println("Positive int");
        }else if (num1 < 0 && num2 < 0 && num3 < 0){
            System.out.println("Negative int");
        }else{
            System.out.println("Zero int");
        }
    }
    
}
