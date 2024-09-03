/**
 * Represents a checking / savings bank account for a customer
 */
public class BankAccount {
    //instance vars
    /**
     * Type of account (checking/savings)
     */
    String accounttype;

    /**
     * Balance for bank account
     */
    double balance;

    /**
     * Customer for this account
     */
    Customer customer;

    //constructor
    /**
     * Creates a bank account of given type for given customer
     * @param accounttype for bacnk account
     * @param customer for bank account
     */
    public BankAccount(String accounttype, Customer customer){
        this.accounttype = accounttype;
        this.customer = customer;
    }

    //methods
    /**
     * deposits the  given amount
     * @param amount to add to balance
     */
    public void deposit(double amount){
        this.balance +=amount;
    }

    /**
     * widthdraw the given amoint from balance
     * @param amount
     * @throws Exception if amoint s larger than availe nalance
     */
    public void withdraw(double amount) throws Exception{
        if (amount > this.balance){
            throw new Exception("Amount is greater than avalibale balance");
        }
        this.balance -=amount;
    }

    /**
     * returns the acount type and balance for this account
     * @return
     */
    public String getAccountInfo(){
        return this.accounttype + " : " + this.balance;
    }

    /**
     * returns the cusotmer name and adress of this bank account
     * @return
     */
    public String getCustomerInfo(){
        return this.customer.getName() + " from " + this.customer.getAddress();
    }

}
