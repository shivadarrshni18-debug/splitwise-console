
import java.util.Scanner;
public class  Splitwise{
    public static void main(String[] args){
        System.out.println("===Splitwise-console===");
        System.out.println("Tracked shared expense with friends.");
        System.out.println("");
        System.out.println("Ready.More features coming in the next lesson");

        Scanner input =new Scanner(System.in);


        System.out.print("Who paid? ");
        String payerName = input.nextLine();
        System.out.print("Total amount (₹)? ");
        double totalAmount = input.nextDouble();
        int numFriends=3;
        double perPersonShare = totalAmount / numFriends;
        String expenseLine = "%s paid ₹%.2f".formatted(payerName, totalAmount);
        String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
        System.out.println(expenseLine);
        System.out.println(shareLine);
    }
}
