
import java.util.Scanner;
import java.util.ArrayList;
public class  Splitwise{
    public static void main(String[] args){
        System.out.println("===Splitwise-console===");
        System.out.println("Tracked shared expense with friends.");
        System.out.println("");
        System.out.println("Ready.More features coming in the next lesson");

        Scanner input =new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();
        boolean running = true;
        while(running) {
            System.out.println("===Menu===");
            System.out.println("1.Record expense");
            System.out.println("2.Add friends");
            System.out.println("3.List friends");
            System.out.println("0.Quit");
            System.out.print("Choice:");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Who paid? ");
                    String payerName = input.nextLine();
                    System.out.print("Total amount (₹)? ");
                    double totalAmount = input.nextDouble();
                    if (friends.isEmpty()) {
                        System.out.println("No friends yet. Add friends first (option 2).");
                    } else {
                        int numFriends = friends.size();
                        double perPersonShare = totalAmount / numFriends;
                        String expenseLine = "%s paid ₹%.2f".formatted(payerName, totalAmount);
                        String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
                        System.out.println(expenseLine);
                        System.out.println(shareLine);
                    }
                }

                case 2->{
                    System.out.print("Friend name: ");
                    String friendName = input.nextLine();
                    friends.add(friendName);
                    System.out.println("Added " + friendName + ".");
                }

                case 3->{
                    if (friends.isEmpty()) {
                        System.out.println("No friends yet. Add friends first (option 2).");
                    } else {
                        for (String name : friends) {
                            System.out.println("- " + name);
                        }

                    }
                }

                case 0 -> {
                    System.out.println("Goodbye!!");
                       running = false;
                }

                default -> System.out.println("Invalid choice.Try again");
            }
        }
    }
}
