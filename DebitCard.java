
/**
 * A DebitCard class which is a sub class of BankCard class
 *
 * @author (Saksham Baral)
 * @version (January 2023)
 */
public class DebitCard extends BankCard
{
    //declaring variables(attributes)
    
   private int pinnumber;
   private int withdrawlamount;
   private String dateofwithdrawl;
   private boolean haswithdrawn;
   
    public DebitCard(int balance_amount, int card_id, String bank_account, String ////A constructor with 6 parameters to be accepted by it
    issuer_bank, String client_name, int pin_number)
    {
        super(balance_amount,card_id,bank_account,issuer_bank);//call to super class
        super.setclientname(client_name);//call to super class
        this.pinnumber=pin_number;
        this.haswithdrawn=false;  
    }
    
    //getter method of 4 attributes
    
    public int getpinnumber() //a getter method which returns value of instance variable pinnumber. 
    {
        return this.pinnumber;
    }
    
    public int getwithdrawlamount() //a getter method which returns value of instance variable withdrawlamount.
    {
        return this.withdrawlamount;
    }
    
    public String getdateofwithdrawl() //a getter method which returns value of instance variable dateofwithdrawl.
    {
        return this.dateofwithdrawl;
    }
    
    public boolean gethaswithdrawn() //a getter method which returns value of instance variable haswithdrawn.
    {
        return this.haswithdrawn;
    }
    
    //setter method for attribute withdrawlamount
    
    public void setwithdrawlamount(int withdrawl_amount) //a setter method which accepts new withdrawl amount value and assign to instance variable
    {
        this.withdrawlamount=withdrawl_amount;
    }
    
    //withdraw method, which is used to decuct the money directly from the client account
    
    public void withdraw(int withdrawl_amount,String date_of_withdrawl, int pin_number){
        //if else condition to check if amount can be withdrawn or not
        if (this.pinnumber == pin_number) {
            if (withdrawl_amount <= super.getbalanceamount()) {
                this.haswithdrawn = true;
                this.withdrawlamount = withdrawl_amount;
                this.dateofwithdrawl = date_of_withdrawl;
                super.setbalanceamount(super.getbalanceamount() - this.withdrawlamount);
            }
            else {
               System.out.println("Insufficient Balance!!!"); 
            }
        }
        else {
            System.out.println("Wrong PIN number");
        }
    }
       
    //display method to display details
    
    public void display()
    {
       super.display();
        
        
        if (this.haswithdrawn==true){
            System.out.println("The pin number is: "+this.pinnumber);
            System.out.println("The withdrawl amount is: "+this.withdrawlamount);
            System.out.println("The date of withdrawl is: "+this.dateofwithdrawl);
            
        }
        else {
            System.out.println("The total balance is: "+super.getbalanceamount());
        }
    } 
}