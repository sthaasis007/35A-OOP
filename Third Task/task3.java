import java.util.Scanner;
public class task3 {
    // Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter a number");
        int num1 = scan.nextInt();
        if (num1 % 5 == 0 && num1 % 11 == 0) {
            System.out.println(num1 + " is divisible by 5 and 11");
        } else {
            System.out.println(num1 + " is not divisible by 5 and 11");
        }
        scan.close();
    }
    
}
