import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("which one do you choose ? ");
        Account account = new Account();
        outerloop:
        do {
            Scanner scanner = new Scanner(System.in);
            var userOrder = scanner.next();
            switch (userOrder) {
                case "b" -> {
                    System.out.println("your balance is");
                    System.out.println(account.showBalance());
                }

                case "w" ->  {
                    System.out.println("you wanna withdraw ...");
                    try {
                        System.out.println("how much? ");
                        var withdraw_amount = scanner.next();
                        var withdraw = account.withdraw(Float.parseFloat(withdraw_amount));

                        System.out.println("now your balance is :" +  withdraw);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                case "d" ->
                {
                    System.out.println("you wanna deposit ...");
                    System.out.println("how much? ");
                    var deposit_amount = scanner.next();
                    var deposit = account.deposit(Float.parseFloat(deposit_amount));
                    System.out.println("now your balance is :" +  deposit);
                }
                case "l" ->
                {
                    System.out.println("your last transaction is : ");
                    System.out.println(account.getLatsTransaction());
                }
                default -> {
                    System.out.println("wrong input");
                    break outerloop ;
                }
            }
        } while (true);
    }
}
