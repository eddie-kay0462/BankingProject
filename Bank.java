import java.util.Scanner;

public class Bank {
    /**
     * represents a bank for managing customers and their bank accounts
     * @param args
     */
    public static void main (String[] args){
        //creates new instance of bank class
       Bank bank = new Bank();

       //calls the run method in the bank class
       bank.run();
    }

    /**runs the program by initialisnngandmanaging bakc accouts and customers */
    public void run(){
        System.out.println("Welcome to the Bank! What is your name? ");
        Scanner scanner =  new Scanner(System.in);

        //get the next token or word which is the cutomers anme
        String name =  scanner.next();

        System.out.println("Hello " + name +" !" + "we are creating checking  and saving acocunt for you");

        //create customer with given name
        Customer customer = new Customer(name);

        //get address
        System.out.println("What is your address");
        scanner.nextLine();
        //get the next token which is the address
        String address = scanner.nextLine();
    
        customer.setAddress(address);

        //create a chekcing account for customer
        BankAccount checkingAccount = new BankAccount("checking", customer);

        //create a savings account for customer
        BankAccount savingAccount = new BankAccount("saving", customer);

        //gets and print the customer info associated with the cheking account
        System.out.println();
        System.out.println("Customer info\n"+checkingAccount.getCustomerInfo());

        //get and print account info for checking account
        System.out.println("Checking Account: ");
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println("Savings account: ");
        System.out.println(savingAccount.getAccountInfo());


        //deposits

        //into checking
        System.out.println(); //blank line
        System.out.println("Amount as a decimal to deposit into the checking account");
        double amount = scanner.nextDouble(); //get the next token (double)
        checkingAccount.deposit(amount); //deposit into checking account

        //into savings
        System.out.println(); //blank line
        System.out.println("Amount as a decimal to deposit into the savings account");
        amount = scanner.nextDouble(); //get the next token (double)
        savingAccount.deposit(amount); //deposit into savings account

        //print new balances
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingAccount.getAccountInfo());
    }
    
}