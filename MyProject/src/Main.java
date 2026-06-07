import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static  void main(String[] args) {

        // JAVA BANKING PROGRAM

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            System.out.println("*********************");
            System.out.println("WELCOME! TO BANKING PROGRAM");
            System.out.println("*********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");
            System.out.println("*********************");

            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdrawal(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println("THANK YOU! Have a nice day");
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit() {
        double amount;

        System.out.print("Enter a amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
    static double withdrawal(double balance){

        double amount;
        System.out.println("Enter amount to be withdrawal: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
}
