/*  write a progrqm to print simple interest from vatriables 
 * make 3 variable from amout , time and rate and save the calculation into a variable
 * formula:
 * si = amount * time *rate/100
*/

public class tassk2 {
    public static void main(String[] args) {
     float principal = 100000;
     float rate = 4.5;
     float time = 10;
     float si = (principal * time * rate) / 100; 
     System.out.println(si);
    }
}
