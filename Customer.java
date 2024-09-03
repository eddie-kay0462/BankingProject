/**
 * Represents a customer of a bank
 */
public class Customer {
    //instance vars
    /**
     * Name of customer
     */
    String name;
    /**
     * address of customer
     */
    String address;

    //constructor
    /**
     * creates a customer with the given name
     * @param name of the customer
     */
    public Customer(String name){
        //sets instance var name to given name
        this.name = name;
    }

    //methods
    /**
     * Sets the address of customer to the given address
     * @param address
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * retunrs vustometd nmr
     * @return namr og customer
     */
    public String getName(){
        return this.name;
    }

    /**
     * returns customers address
     * @return address of customer
     */
    public String getAddress(){
        return this.address;
    }

    
}
