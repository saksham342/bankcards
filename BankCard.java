
/**
 * A BankCard Class which is a super class of two classes: DebitCard and CreditCard classes
 * 
 * @author (Saksham Baral)
 * @version (January 2023)
 */
public class BankCard
{
    //declaring variables(attributes)
   private int cardID;
   private String clientname;
   private String issuerbank;
   private String bankaccount;
   private int balanceamount;
   
   public BankCard(int balance_amount, int card_id, String bank_account, String issuer_bank) //A constructor which accpts four parameters
   {
       this.clientname="";
       this.cardID = card_id;
       this.issuerbank = issuer_bank;
       this.bankaccount = bank_account;
       this.balanceamount = balance_amount;
   }
   
   //getters method of 5 attributes
   
   public int getcardID() //a getter method which returns value of instance variable cardID 
   {
    return this.cardID;
   }
   
   public String getclientname() //a getter method which returns value of instance variable clientname
   {
    return this.clientname;
   }
   
   public String getissuerbank() //a getter method which returns value of instance variable issuerbank
   {
    return this.issuerbank;
   }
   
   public String getbankaccount() //a getter method which returns value of instance variable bankaccount
   {
    return this.bankaccount;
   }
   
   public int getbalanceamount() //a getter method which returns value of instance variable balanceamount
   {
    return this.balanceamount;
   }
   
    //setter methods to set the client name and balance amount  
   
   public void setclientname(String newclient_name) //a setter method which accepts new clientname value
   {
        this.clientname = newclient_name;
   }
   
   public void setbalanceamount(int newbalance_amount) //a setter method which accepts new balanceamount value
   {
       this.balanceamount = newbalance_amount;
   }
   
   //display method to display the output
   
   public void display() //A method to display the results
   {
   System.out.println("The card Id is: "+this.cardID);
   System.out.println("The issuer bank is: "+this.issuerbank);
   System.out.println("The bank account is:"+this.bankaccount);
   System.out.println("The balanceamount is: "+this.balanceamount);
   
   //if else condition in client name
   
       if(this.clientname=="") {
           System.out.println("Please Enter a client name"); 
       }
       else {
           System.out.println("The name of account holder is: "+this.clientname);
       }
    }
}