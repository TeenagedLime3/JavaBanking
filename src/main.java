import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){


        ArrayList<String> name = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("are you the account holder?");
        String yesOrNo = String.valueOf(scanner.nextLine());
        if (yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("Please enter your name(s) followed by enter, entering exit to continue");
            String enteredName = "";
            while(!enteredName.equals("exit")){
                enteredName = String.valueOf(scanner.nextLine());
                name.add(enteredName);
            }
            name.remove(name.size()-1);
            BankingCard card = new BankingCard(0, name);
            System.out.println(card.displayBalance());
        } else {
            System.out.println("You cannot create a bank account on behalf of someone else");
        }


    }
}
