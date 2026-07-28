public class  Splitwise{
    public static void main(String[] args){
        System.out.println("===Splitwise-console===");
        System.out.println("Tracked shared expense with friends.");
        System.out.println("");
        System.out.println("Ready.More features coming in the next lesson");
        String payerName ="Riya";
        double totalAmount=500.0;
        int numFriends=3;
        double perPersonShare = totalAmount / numFriends;
        System.out.println(payerName );
        System.out.println(totalAmount);
        System.out.println(numFriends);
        System.out.println(perPersonShare);
    }
}
