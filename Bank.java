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

        System.out.println("Hello " + name +" !" + "we are creating checking s and saving acocunt for you");

        //create customer with given name
        Customer customer = new Customer(name);
    }
    
}