import java.util.Scanner;
public class cw {
    public static void main(String[] args) {
        /*break and continue are jump statement */
        for (int i = 0; i <= 3; i++){
           if (i==2){
               break;
           }
           System.out.println("Index " + i);
        }   
        System.out.println("This will execute after loop ends/break");
        /*can be used in while */
        int count = 0;
        while(count <= 3){
               if (count == 2){
                   break;
               }
               System.out.println("While count" + count);
               count += 1;
           }
           System.out.println("This will execute after while loop ends/break");
   
           /* Countinue will skip the iteration and goto next loop */
           for (int index = 0; index <= 5; index ++){
               if(index == 2){
                   continue;
               }
               System.out.println("Continue Loop " + index);
           }
           /*In the above loop when index == 2 the line/statement below it will be skipped */
   
        }
   }