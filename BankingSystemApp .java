import java.util.Scanner;

 class BankingSystemApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SavingsAccount account =
                new SavingsAccount("ACC1001", 5000, 3.5);

        boolean running = true;

        while (running) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Add Interest");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        account.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        account.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        account.displayBalance();
                        break;

                    case 4:
                        account.addInterest();
                        System.out.println("Interest added.");
                        break;

                    case 5:
                        account.showTransactions();
                        break;

                    case 6:
                        running = false;
                        System.out.println("Thank you for using the bank.");
                        break;

                    default:
                        System.out.println("Invalid option.");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
