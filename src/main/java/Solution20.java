import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        //may want to change order to a double
        int order = input.nextInt();
        System.out.print("What state do you live in? ");
        String state = input.next();
        if (state.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            String county = input.next();
            if (county.equals("Eau Claire")) {
                double tax = order * 0.055;
                double total = order + tax;
                System.out.printf("The tax is %.2f.\nThe total is %.2f.\n", tax, total);
            } else if (county.equals("Dunn")) {
                double tax = order * 0.054;
                double total = order + tax;
                System.out.printf("The tax is %.2f.\nThe total is %.2f.\n", tax, total);
            } else {
                System.out.printf("The total is %d.\n", order);
            }
        } else if (state.equals("Illinois")) {
            double tax = order * 0.08;
            double total = order + tax;
            System.out.printf("The tax is %.2f.\nThe total is %.2f.\n", tax, total);
        } else {
            System.out.printf("The total is %d.\n", order);
        }
    }
}
