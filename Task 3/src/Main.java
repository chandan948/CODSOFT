import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter initial account balance of user/your: ");
        double inibal = s.nextDouble();

        acc usac = new acc(inibal);
        Machine atmmachine = new Machine(usac);

        while (true) {
            atmmachine.displayMenu();
            System.out.print("Enter your choice from 1 to 4: ");
            int choice = s.nextInt();
            atmmachine.processOption(choice);
        }
    }
}

class acc {
    private double bal;

    public acc(double inibal) {
        this.bal = inibal;
    }

    public double getBalance() {
        return bal;
    }

    public void deposit(double amut) {
        if (amut > 0) {
            bal += amut;
            System.out.println("Deposited/(amount added) to your account.\n Your New balance: " + bal);
        } else {
            System.out.println("ops! You you have to add a amount 0(zero) and -(negative) can't be deposited.");
        }
    }

    public void withdraw(double amut) {
        if (amut > 0 && amut <= bal) {
            bal -= amut;
            System.out.println("Withdrawal successful. New balance: " + bal);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class Machine {
    private acc usac;

    public Machine(acc account) {
        this.usac = account;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        Scanner s = new Scanner(System.in);

        switch (option) {
            case 1:
                System.out.println("Current Balance: " + usac.getBalance());
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = s.nextDouble();
                usac.deposit(depositAmount);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = s.nextDouble();
                usac.withdraw(withdrawalAmount);
                break;

            case 4:
                System.out.println("Bye Bye My dear user! use this ATM again! ");
                System.exit(0);
                break;

            default:
                System.out.println("Bro, choose for 1 to 4.");
        }
    }
}


