
import java.util.Scanner;
import java.util.ArrayList;
public class  Splitwise{

       public static void addfriends(Scanner input,ArrayList<Friend> friends) {
           System.out.print("Friend name: ");
           String friendName = input.nextLine();
           friends.add( new Friend(friendName));
           System.out.println("Added " + friendName + ".");
    }



    public static void main(String[] args){
        System.out.println("===Splitwise-console===");
        System.out.println("Tracked shared expense with friends.");
        System.out.println("");
        System.out.println("Ready.More features coming in the next lesson");

        Scanner input =new Scanner(System.in);
        ArrayList<Friend> friends = new ArrayList<>();
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
                    if (friends.isEmpty()) {
                    System.out.println("No friends yet. Add friends first (option 2).");
                    }

                   else {
                        System.out.print("Who paid? ");
                        String payerName = input.nextLine();
                        System.out.print("Total amount (₹)? ");
                        double totalAmount = input.nextDouble();
                        int numFriends = friends.size();
                        double perPersonShare = totalAmount / numFriends;
                        String expenseLine = "%s paid ₹%.2f".formatted(payerName, totalAmount);
                        String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
                        System.out.println(expenseLine);
                        System.out.println(shareLine);
                   }
                }

                case 2->{
                   addfriends(input,friends);
                }

                case 3->{
                    if (friends.isEmpty()) {
                        System.out.println("No friends yet. Add friends first (option 2).");
                    } else {
                        for (Friend friend : friends) {
                            System.out.println("- " + friend.getName());
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
