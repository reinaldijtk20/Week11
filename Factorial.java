import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while(keepGoing.equals("Y") || keepGoing.equals("y")) {
            System.out.print("Enter an integer : ");
            int val = scan.nextInt();
            try {
                System.out.println("Factorial (" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            System.out.print("Another Factorial : ");
            keepGoing = scan.next();
        }
    }
}
