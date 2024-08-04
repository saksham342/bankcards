
/**
 * A CreditCard class which is a sub class of BankCard class. 
 *
 * @author (Saksham Baral) 
 * @version (January 2023)
 */
public class CreditCard extends BankCard
{
    //declaring variables(attributes)
    private int cvcnumber;
    private double creditlimit;
    private double interestrate;
    private String expirationdate;
    private int graceperiod;
    private boolean isgranted;
    
    public CreditCard(int card_id, String client_name, 
    String issuer_bank,String bank_account, int balance_amount, 
    int cvc_number, double interest_rate, String expiration_date)
    {
        super(balance_amount,card_id,bank_account,issuer_bank);
        super.setclientname(client_name);
        this.cvcnumber = cvc_number;
        this.interestrate = interest_rate;
        this.expirationdate = expiration_date;
        this.isgranted = false;
    }
    
    //getter method of each attributes
    
    public int getcvcnumber() //a getter method which returns value of instance variable cvcnumber. 
    {
        return this.cvcnumber;
    }
    
    public double getcreditlimit() //a getter method which returns value of instance variable creditlimit. 
    {
        return this.creditlimit;
    }
    
    public double getinterestrate() //a getter method which returns value of instance variable interestrate. 
    {
        return this.interestrate;
    }
    
    public String getexpirationdate() //a getter method which returns value of instance variable expirationdate. 
    {
        return this.expirationdate;
    }
    
    public int getgraceperiod() //a getter method which returns value of instance variable graceperiod. 
    {
        return this.graceperiod;
    }
    
    public boolean getisgranted() //a getter method which returns value of instance variable isgranted. 
    {
        return this.isgranted;
    }
    
    //method to set credit card limit
    
    public void setcreditlimit(double credit_limit, int grace_period) 
    {
        if (credit_limit <= 2.5 * super.getbalanceamount()) {
            this.creditlimit = credit_limit;
            this.graceperiod = grace_period;
            this.isgranted = true;
        }
        if(isgranted == false) {
            if(credit_limit > 2.5 * super.getbalanceamount()) {
                System.out.println("Credit cannot be issued.");
            }
        }
    }
    
    //Method to cancle credit card
    
    public void cancelcreditcard()
    {
        this.cvcnumber = 0;
        this.creditlimit = 0;
        this.graceperiod = 0;
        this.isgranted = false;
          
    }
    
    //method to display the output
    public void display()
    {
        super.display();
        if (this.isgranted == true) {
        System.out.println("The credit limit is: "+this.creditlimit);
        System.out.println("The grace period is: "+this.graceperiod);
        }
        else {
        System.out.println("No granted credit, grace period and credit limit cannot be shown.");
        System.out.println("The cvc number is: "+this.cvcnumber);
        System.out.println("The interest rate is: "+this.interestrate);
        System.out.println("The expiration date is: "+this.expirationdate);
        System.out.println("The value of isgranted is: "+this.isgranted);
        }
    }    
}