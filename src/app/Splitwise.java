package app;

import model.Friend;
import model.ExpenseLine;

import java.util.Scanner;
import java.util.ArrayList;
public class  Splitwise{

     private static class FriendDisplay {
         static String listLine(Friend friend) {
             return "- %d:  %s.".formatted(friend.getId(), friend.getName());
         }

         static String addedMessage(Friend friend){
             return "Added %s (id %d).".formatted(friend.getName(),friend.getId());
         }
     }


         public static void addfriends(Scanner input, ArrayList<Friend> friends) {
             System.out.print("Friend name: ");
             String friendName = input.nextLine();
             Friend friend = new Friend(friendName);
             friends.add(friend);
             System.out.println(FriendDisplay.addedMessage(friend));
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

                        ExpenseLine line=new ExpenseLine(payerName,totalAmount);
                        int numFriends = friends.size();
                        double perPersonShare = line.amount()/ numFriends;

                        String expenseLine = "%s paid ₹%.2f".formatted(line.payerName(),line.amount());
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
                        System.out.println("Friends:");
                        for (Friend friend : friends) {
                            System.out.println(FriendDisplay.listLine(friend));
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
