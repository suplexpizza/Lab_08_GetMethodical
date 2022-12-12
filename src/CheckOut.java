import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double total = 0;
        boolean done = false;

        while (!done) {
            double price = SafeInput.getRangedDouble(in, "Enter your the price of your item", .50, 9.99);
            total += price;
            boolean again = SafeInput.getYNConfirm(in, "Do you want to continue shopping");

            if(again==false)
            {
                done=true;
            }
        }
        System.out.printf("Total price is %.2f", total);
    }
}