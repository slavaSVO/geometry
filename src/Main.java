import begin.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello. User");
        System.out.println("Input square side: ");
        Scanner scan = new Scanner(System.in);
        double squareSide = scan.nextDouble();
        try {
            ;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
