//importing necessary packages
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Creation of a GUI for getting input values of debit and credit card and adding them to an arraylist with proper validation and perform other action appending with previous coursework.
 *
 * @author (Saksham Baral)
 * @version (25th april, 2023)
 */
public class BankGUI implements ActionListener
{  
   private ArrayList<BankCard> bankcards = new ArrayList<BankCard>();
   private JFrame frame;
   private JPanel panel;
   private JTextField TFcardid1, TFcardid2, TFcardid3, TFcardid4, TFclientname, TFissuerbank, TFbankaccount, TFbalanceamount, TFwithdrawlamount, TFpinno1, TFpinno2, TFcvcnumber,
   TFinterestrate, TFcreditlimit, TFgraceperiod;
   private JLabel welcome, enmb, debit_credit_title, withdrawl_title, cancel_credit_title, JLcard_id1, JLcard_id2, JLcard_id3, JLcard_id4, JLclient_name, JLissuer_bank, JLbank_account, JLbalance_amount, JLwithdrawl_amount,
   JLpin_no1, JLpin_no2, JLcvc_number, JLinterest_rate, JLexpire_date, credit_limit_title, JLcredit_limit, JLgrace_period, JLwithdrawl_date;
   private JComboBox<String> expire_year, expire_month, expire_day, withdrawl_year, withdrawl_month, withdrawl_day;
   private JButton withdraw, adddebit, addcredit, setcreditlimit, cancelcreditcard, clear, displaycredit, displaydebit;
   private JSeparator separator1, separator2, separator3, separator4, separator5, separator6, separator7, separator8, separator9, separator10, separator11, separator12, separator13, separator14, separator15, separator16;
   public BankGUI(){
       
       //creating and managing JFrame named as frame
       frame = new JFrame("Bank Cards management");
       
       //creating  Jpanel named as panel
       panel = new JPanel();
       
       //creating and formatting JLabel, JTextFields, JSeparator, JComboBox for different text labels and text fields, lines and dropdown selections
       //Welcome message
       welcome = new JLabel("Welcome to");
       welcome.setFont(new Font("Monospaced", Font.BOLD, 25));
       welcome.setForeground(new Color(255, 249, 51));
       welcome.setBounds(650, 20, 152, 25);
       panel.add(welcome);
       
       enmb = new JLabel("eNMB");
       enmb.setFont(new Font("Monospaced", Font.BOLD, 25));
       enmb.setForeground(new Color(51, 131, 255));
       enmb.setBounds(815, 20, 100, 25);
       panel.add(enmb);
       
       
       debit_credit_title = new JLabel("Add Debit and Credit Cards");
       debit_credit_title.setFont(new Font("SansSerif", Font.BOLD, 17));
       debit_credit_title.setForeground(new Color(51, 131, 255));
       debit_credit_title.setBounds(210, 80, 220, 20);
       panel.add(debit_credit_title);
       
       withdrawl_title = new JLabel("Withdraw from Debitcard");
       withdrawl_title.setFont(new Font("SansSerif", Font.BOLD, 17));
       withdrawl_title.setForeground(new Color(51, 131, 255));
       withdrawl_title.setBounds(1120, 80, 220, 20);
       panel.add(withdrawl_title);
       
       JLcard_id1 = new JLabel("Card ID :");
       JLcard_id1.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLcard_id1.setBounds(100, 140, 70, 20);
       panel.add(JLcard_id1);
       
       TFcardid1 = new JTextField();
       TFcardid1.setBounds(270, 140, 210, 28);
       panel.add(TFcardid1);
       
       
       JLclient_name = new JLabel("Client Name :");
       JLclient_name.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLclient_name.setBounds(100, 180, 120, 20);
       panel.add(JLclient_name);
       
       TFclientname = new JTextField();
       TFclientname.setBounds(270, 180, 210, 28);
       panel.add(TFclientname);
       
       JLissuer_bank = new JLabel("Issuer Bank :");
       JLissuer_bank.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLissuer_bank.setBounds(100, 220, 120, 20);
       panel.add(JLissuer_bank);
       
       TFissuerbank = new JTextField();
       TFissuerbank.setBounds(270, 220, 210, 28);
       panel.add(TFissuerbank);
       
       JLbank_account = new JLabel("Bank Account :");
       JLbank_account.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLbank_account.setBounds(100, 260, 140, 20);
       panel.add(JLbank_account);
       
       TFbankaccount = new JTextField();
       TFbankaccount.setBounds(270, 260, 210, 28);
       panel.add(TFbankaccount);
       
       JLbalance_amount = new JLabel("Balance Amount :");
       JLbalance_amount.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLbalance_amount.setBounds(100, 300, 250, 20);
       panel.add(JLbalance_amount);
       
       TFbalanceamount = new JTextField();
       TFbalanceamount.setBounds(270, 300, 210, 28);
       panel.add(TFbalanceamount);
       
       JLpin_no1 = new JLabel("PIN No :");
       JLpin_no1.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLpin_no1.setBounds(50, 400, 70, 20);
       panel.add(JLpin_no1);
       
       TFpinno1 = new JTextField();
       TFpinno1.setBounds(150, 400, 150, 28);
       panel.add(TFpinno1);
       
       JLcvc_number = new JLabel("CVC Number :");
       JLcvc_number.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLcvc_number.setBounds(390, 400, 170, 20);
       panel.add(JLcvc_number);
       
       TFcvcnumber = new JTextField();
       TFcvcnumber.setBounds(540, 400, 150, 28);
       panel.add(TFcvcnumber);
       
       JLinterest_rate = new JLabel("Interest Rate :");
       JLinterest_rate.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLinterest_rate.setBounds(390, 440, 170, 20);
       panel.add(JLinterest_rate);
       
       TFinterestrate = new JTextField();
       TFinterestrate.setBounds(540, 440, 150, 28);
       panel.add(TFinterestrate);
       
       JLexpire_date = new JLabel("Expiration Date :");
       JLexpire_date.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLexpire_date.setBounds(390, 480, 170, 20);
       panel.add(JLexpire_date);
       
       String year[] = {"Y","2024","2025","2026","2027","2028","2029","2030", "2031", "2032", "2033", "2034", "2035"};
       String month[] = {"M","01","02","03","04","05","06","07","08","09","10","11","12"};
       String day[] = {"D","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
       expire_year = new JComboBox<>(year);
       expire_month = new JComboBox<>(month);
       expire_day = new JComboBox<>(day);
       expire_year.setBounds(540,480,55,20);
       expire_month.setBounds(600,480,40,20);
       expire_day.setBounds(645,480,40,20);
       panel.add(expire_year);
       panel.add(expire_month);
       panel.add(expire_day);
       
       addcredit = new JButton("Add to Credit Card");
       addcredit.setFont(new Font("SansSerif", Font. PLAIN, 16));
       addcredit.setForeground(new Color(86, 214, 0));
       addcredit.setBounds(390, 520, 180, 35);
       panel.add(addcredit);
       
       adddebit = new JButton("Add to Debit Card");
       adddebit.setFont(new Font("SansSerif", Font. PLAIN, 16));
       adddebit.setForeground(new Color(86, 214, 0));
       adddebit.setBounds(50, 520, 180, 35);
       panel.add(adddebit);
       
       cancel_credit_title = new JLabel("Cancel Credit Card");
       cancel_credit_title.setFont(new Font("SansSerif", Font.BOLD, 17));
       cancel_credit_title.setForeground(new Color(51, 131, 255));
       cancel_credit_title.setBounds(210, 590, 200, 20);
       panel.add(cancel_credit_title);
       
       JLcard_id2 = new JLabel("Card ID :");
       JLcard_id2.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLcard_id2.setBounds(100, 635, 70, 20);
       panel.add(JLcard_id2);
       
       TFcardid2 = new JTextField();
       TFcardid2.setBounds(270, 635, 210, 28);
       panel.add(TFcardid2);
       
       cancelcreditcard = new JButton("Cancel Credit Card");
       cancelcreditcard.setFont(new Font("SansSerif", Font. PLAIN, 16));
       cancelcreditcard.setForeground(new Color(255, 0, 0));
       cancelcreditcard.setBounds(50, 670, 180, 35);
       panel.add(cancelcreditcard);
       
       
       
       
       JLcard_id3 = new JLabel("Card ID :");
       JLcard_id3.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLcard_id3.setBounds(1000, 140, 70, 20);
       panel.add(JLcard_id3);
       
       TFcardid3 = new JTextField();
       TFcardid3.setBounds(1170, 140, 210, 28);
       panel.add(TFcardid3);
       
       JLwithdrawl_amount = new JLabel("Withdraw Amount :");
       JLwithdrawl_amount.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLwithdrawl_amount.setBounds(1000, 180, 200, 20);
       panel.add(JLwithdrawl_amount);
       
       TFwithdrawlamount = new JTextField();
       TFwithdrawlamount.setBounds(1170, 180, 210, 28);
       panel.add(TFwithdrawlamount);
       
       JLwithdrawl_date = new JLabel("Withdrawl Date :");
       JLwithdrawl_date.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLwithdrawl_date.setBounds(1000, 220, 200, 20);
       panel.add(JLwithdrawl_date);
       
       String year2[] = {"Y","2020", "2021", "2022", "2023", "2024","2025","2026","2027","2028","2029","2030"};
       String month2[] = {"M","01","02","03","04","05","06","07","08","09","10","11","12"};
       String day2[] = {"D","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
       withdrawl_year = new JComboBox<>(year2);
       withdrawl_month = new JComboBox<>(month2);
       withdrawl_day = new JComboBox<>(day2);
       withdrawl_year.setBounds(1170,220,55,20);
       withdrawl_month.setBounds(1230,220,40,20);
       withdrawl_day.setBounds(1275,220,40,20);
       panel.add(withdrawl_year);
       panel.add(withdrawl_month);
       panel.add(withdrawl_day);
       
       JLpin_no2 = new JLabel("PIN No :");
       JLpin_no2.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLpin_no2.setBounds(1000, 260, 70, 20);
       panel.add(JLpin_no2);
       
       TFpinno2 = new JTextField();
       TFpinno2.setBounds(1170, 260, 150, 28);
       panel.add(TFpinno2);
       
       withdraw = new JButton("Withdraw");
       withdraw.setFont(new Font("SansSerif", Font. PLAIN, 16));
       withdraw.setForeground(new Color(86, 214, 0));
       withdraw.setBounds(1000, 320, 180, 35);
       panel.add(withdraw);
       
       credit_limit_title = new JLabel("Set Credit Limit");
       credit_limit_title.setFont(new Font("SansSerif", Font.BOLD, 17));
       credit_limit_title.setForeground(new Color(51, 131, 255));
       credit_limit_title.setBounds(1120, 420, 220, 20);
       panel.add(credit_limit_title);
       
       JLcard_id4 = new JLabel("Card ID :");
       JLcard_id4.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLcard_id4.setBounds(1000, 480, 70, 20);
       panel.add(JLcard_id4);
       
       TFcardid4 = new JTextField();
       TFcardid4.setBounds(1170, 480, 210, 28);
       panel.add(TFcardid4);
       
       JLcredit_limit = new JLabel("Credit Limit :");
       JLcredit_limit.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLcredit_limit.setBounds(1000, 520, 200, 20);
       panel.add(JLcredit_limit);
       
       TFcreditlimit = new JTextField();
       TFcreditlimit.setBounds(1170, 520, 210, 28);
       panel.add(TFcreditlimit);
       
       JLgrace_period = new JLabel("Grace Period :");
       JLgrace_period.setFont(new Font("SansSerif", Font. PLAIN, 17));
       JLgrace_period.setBounds(1000, 560, 120, 20);
       panel.add(JLgrace_period);
       
       TFgraceperiod = new JTextField();
       TFgraceperiod.setBounds(1170, 560, 150, 28);
       panel.add(TFgraceperiod);
       
       setcreditlimit = new JButton("Set");
       setcreditlimit.setFont(new Font("SansSerif", Font. PLAIN, 16));
       setcreditlimit.setForeground(new Color(86, 214, 0));
       setcreditlimit.setBounds(1000, 600, 140, 35);
       panel.add(setcreditlimit);
       
       
       
       //Adding JSeparator for generation of separator lines
       separator1 = new JSeparator();
       separator1.setOrientation(JSeparator.VERTICAL);
       separator1.setBounds(740, 70, 5, 650);
       panel.add(separator1);
       separator2 = new JSeparator();
       separator2.setOrientation(JSeparator.VERTICAL);
       separator2.setBounds(741, 70, 5, 650);
       panel.add(separator2);
       separator3 = new JSeparator();
       separator3.setOrientation(JSeparator.VERTICAL);
       separator3.setBounds(742, 70, 5, 650);
       panel.add(separator3);
       separator4 = new JSeparator();
       separator4.setOrientation(JSeparator.VERTICAL);
       separator4.setBounds(743, 70, 5, 650);
       panel.add(separator4);
       
       separator5 = new JSeparator();
       separator5.setOrientation(JSeparator.VERTICAL);
       separator5.setBounds(760, 70, 5, 650);
       panel.add(separator5);
       separator6 = new JSeparator();
       separator6.setOrientation(JSeparator.VERTICAL);
       separator6.setBounds(761, 70, 5, 650);
       panel.add(separator6);
       separator7 = new JSeparator();
       separator7.setOrientation(JSeparator.VERTICAL);
       separator7.setBounds(762, 70, 5, 650);
       panel.add(separator7);
       separator8 = new JSeparator();
       separator8.setOrientation(JSeparator.VERTICAL);
       separator8.setBounds(763, 70, 5, 650);
       panel.add(separator8);
       
       //separator between add to debit and add to credit
       separator9 = new JSeparator();
       separator9.setOrientation(JSeparator.VERTICAL);
       separator9.setBounds(360, 390, 5, 180);
       panel.add(separator9);
       
       //separator between withdraw from debit card and set credit limit
       separator10 = new JSeparator();
       separator10.setOrientation(JSeparator.HORIZONTAL);
       separator10.setBounds(763, 380, 780, 5);
       panel.add(separator10);
       
       //separator between add to cards and cancel credit card
       separator11 = new JSeparator();
       separator11.setOrientation(JSeparator.HORIZONTAL);
       separator11.setBounds(1, 570, 739, 5);
       panel.add(separator11);
       
       //separator at the end of cancel credit card
       separator11 = new JSeparator();
       separator11.setOrientation(JSeparator.HORIZONTAL);
       separator11.setBounds(1, 710, 739, 5);
       panel.add(separator11);
       
       //separator at the end of set credit limit
       separator12 = new JSeparator();
       separator12.setOrientation(JSeparator.HORIZONTAL);
       separator12.setBounds(763, 710, 775, 5);
       panel.add(separator12);
       
       //separator at the top
       separator13 = new JSeparator();
       separator13.setOrientation(JSeparator.HORIZONTAL);
       separator13.setBounds(1, 69, 1538, 5);
       panel.add(separator13);
       
       
       //Adding clear button with all details
       clear = new JButton("Clear");
       clear.setFont(new Font("Monospaced", Font.BOLD, 20));
       clear.setForeground(new Color(255,0, 0));
       clear.setBounds(680, 720, 140, 45);
       panel.add(clear);
       
       //Adding displaycredit button to display the credit details
       displaycredit = new JButton("Display CreditCard");
       displaycredit.setFont(new Font("Monospaced", Font.BOLD, 20));
       displaycredit.setForeground(new Color(86, 214, 0));
       displaycredit.setBounds(890, 720, 250, 35);
       panel.add(displaycredit);
       
       //Adding displaydebit button to display the credit details
       displaydebit = new JButton("Display DebitCard");
       displaydebit.setFont(new Font("Monospaced", Font.BOLD, 20));
       displaydebit.setForeground(new Color(86, 214, 0));
       displaydebit.setBounds(360, 720, 250, 35);
       panel.add(displaydebit);
       
       //formatting of frame 
       frame.setSize(1920, 1080);
       frame.setLayout(null);
       frame.setVisible(true);
       frame.setResizable(false);
       
       //formatting of panel
       panel.setSize(1920, 1080);
       panel.setBounds(0,0,1920,1080);
       panel.setBackground(new Color(180,180,180));
       panel.setLayout(null);
       frame.add(panel);
       
       //Adding buttons to actionListener
       adddebit.addActionListener(this); 
       addcredit.addActionListener(this);
       withdraw.addActionListener(this);
       setcreditlimit.addActionListener(this);
       cancelcreditcard.addActionListener(this);
       clear.addActionListener(this);
       displaycredit.addActionListener(this);
       displaydebit.addActionListener(this);
       
   }
   @Override
   //overriding method actionPerformed
   public void actionPerformed(ActionEvent a){
        //adding debit card details with proper validation of inputted fields
        if(a.getSource()==adddebit){
            if(TFcardid1.getText().isEmpty() || TFclientname.getText().isEmpty() || 
                TFissuerbank.getText().isEmpty() || TFbankaccount.getText().isEmpty() ||
                TFbalanceamount.getText().isEmpty() || TFpinno1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill up the all required fields", "Error", JOptionPane.ERROR_MESSAGE);
                }
            else{  
                try{
                    int balanceAmount = Integer.parseInt(TFbalanceamount.getText());
                    int pinNumber = Integer.parseInt(TFpinno1.getText());
                    String bankAccount = TFbankaccount.getText();
                    int cardId = Integer.parseInt(TFcardid1.getText());
                    String clientName = TFclientname.getText();
                    String issuerBank = TFissuerbank.getText();
                    boolean ifCardIDAlready = false;
                    
                    for (BankCard eachDebit: bankcards)
                    {
                        if (eachDebit instanceof DebitCard)
                        {
                            DebitCard debitObject = (DebitCard) eachDebit;   //downcasting
                            
                            //compare the card id if it is already or not
                            if (debitObject.getcardID() == cardId){
                                ifCardIDAlready = true;
                            }
                        }
                    }
                    
                    if (ifCardIDAlready == false){
                        DebitCard debitCard = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                        
                        // Add the DebitCard object to the ArrayList
                        bankcards.add(debitCard);
                        TFcardid1.setText("");
                        TFclientname.setText("");
                        TFissuerbank.setText("");
                        TFbankaccount.setText("");
                        TFbalanceamount.setText("");   
                        TFpinno1.setText("");
                        TFpinno2.setText("");
                        JOptionPane.showMessageDialog(frame, "Debit Card is added successfully\n\nCard ID: "+cardId+ "\nClient Name: " + clientName + "\nIssuer Bank: " + issuerBank + "\nBank Account: " + bankAccount + "\nBalance Amount: " + balanceAmount + "\nPin Number: " + pinNumber, "Information", JOptionPane.INFORMATION_MESSAGE);

                    }
                    else if (ifCardIDAlready == true){
                        JOptionPane.showMessageDialog(frame, "The debit card detail of this Card Id is already present. Please enter with new Card Id.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                        
                    }
                    
                    catch(NumberFormatException numex){
                    JOptionPane.showMessageDialog(frame, "Invalid input. Check again and fillup valid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        
        
        //adding credit card details with proper validation of inputted fields
        else if(a.getSource()==addcredit){
            if(TFcardid1.getText().isEmpty() || TFclientname.getText().isEmpty() || 
                TFissuerbank.getText().isEmpty() || TFbankaccount.getText().isEmpty() ||
                TFbalanceamount.getText().isEmpty() || TFcvcnumber.getText().isEmpty() ||
                TFinterestrate.getText().isEmpty() || expire_year.getSelectedItem() == "Y" ||
                expire_month.getSelectedItem() == "M" || expire_day.getSelectedItem() == "D"){
                    JOptionPane.showMessageDialog(null, "Please fill up the all required fields", "Error", JOptionPane.ERROR_MESSAGE);
                    
            }
            else{
                try{
                    int balanceAmount = Integer.parseInt(TFbalanceamount.getText());
                    String bankAccount = TFbankaccount.getText();
                    int cardId = Integer.parseInt(TFcardid1.getText());
                    String clientName = TFclientname.getText();
                    String issuerBank = TFissuerbank.getText();
                    int cvcNumber = Integer.parseInt(TFcvcnumber.getText());
                    double interestRate = Double.parseDouble(TFinterestrate.getText());
                    String exp_year = (String) expire_year.getSelectedItem();
                    String exp_month = (String) expire_month.getSelectedItem();
                    String exp_day = (String) expire_day.getSelectedItem();
                    String expirationDate = exp_year + "-" + exp_month + "-" + exp_day;
                    boolean ifCardIDAlready = false;
                    for (BankCard eachCredit: bankcards)
                    {
                        if ( eachCredit instanceof CreditCard)
                        {
                            CreditCard creditObject = (CreditCard) eachCredit;   //downcasting
                            
                            //compare the cardid if it is already present or not
                            if (creditObject.getcardID()== cardId)
                            {
                                ifCardIDAlready = true;
                            }
                        }
                    }
                    if (ifCardIDAlready == false){
                        CreditCard creditCard = new CreditCard(cardId, clientName, issuerBank,bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                        bankcards.add(creditCard);
                        TFcardid1.setText("");
                        TFclientname.setText("");
                        TFissuerbank.setText("");
                        TFbankaccount.setText("");
                        TFbalanceamount.setText("");  
                        TFpinno1.setText("");
                        TFcvcnumber.setText("");
                        TFinterestrate.setText("");
                        expire_year.setSelectedIndex(0);
                        expire_month.setSelectedIndex(0);
                        expire_day.setSelectedIndex(0);
                        withdrawl_year.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(frame, "Credit Card is added successfully\n\nCard ID: "+cardId+ "\nClient Name: " + clientName + "\nIssuer Bank: " + issuerBank + "\nBank Account: " + bankAccount + "\nBalance Amount: " + balanceAmount + "\nCVC Number: " + cvcNumber + "\nInterest Rate: " + interestRate+ "\nExpiration Date: " + expirationDate, "Information", JOptionPane.INFORMATION_MESSAGE);

                    }
                    else if (ifCardIDAlready == true){
                        JOptionPane.showMessageDialog(frame, "The credit card detail of this Card Id is already present. Please enter with new Card Id.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    //create a new CreditCard object
                    
                }catch(NumberFormatException numex){
                    JOptionPane.showMessageDialog(frame, "Invalid input. Check again and fillup valid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        
        
        //withdrawing of amount from debit card on button click
        else if(a.getSource()==withdraw){
            if(TFpinno2.getText().isEmpty() || TFcardid3.getText().isEmpty() || 
                TFwithdrawlamount.getText().isEmpty() || withdrawl_year.getSelectedItem() == "Y" ||
                withdrawl_month.getSelectedItem() == "M" || withdrawl_day.getSelectedItem() == "D"){
                    JOptionPane.showMessageDialog(null, "Please fill up the all required fields", "Error", JOptionPane.ERROR_MESSAGE);
                }
            else{
                
                try{
                    int pinNumber = Integer.parseInt(TFpinno2.getText());
                    int cardId = Integer.parseInt(TFcardid3.getText());
                    int withdrawlAmount = Integer.parseInt(TFwithdrawlamount.getText());
                    String with_year = (String) withdrawl_year.getSelectedItem();
                    String with_month = (String) withdrawl_month.getSelectedItem();
                    String with_day = (String) withdrawl_day.getSelectedItem();
                    String withdrawlDate = with_year + "-" + with_month + "-" + with_day;
                    boolean withdrawflag = false;
                    for (BankCard eachDebit: bankcards)
                    {   
                        if (eachDebit instanceof DebitCard){
                            DebitCard debitObject = (DebitCard) eachDebit;   //downcasting
                            if (cardId == debitObject.getcardID()){
                                withdrawflag = true;
                                if (pinNumber == debitObject.getpinnumber()){
                                    if (withdrawlAmount <= debitObject.getbalanceamount()){
                                        debitObject.withdraw(withdrawlAmount,withdrawlDate,pinNumber);
                                        TFcardid3.setText("");   
                                        TFwithdrawlamount.setText("");
                                        TFpinno2.setText("");
                                        withdrawl_year.setSelectedIndex(0);
                                        withdrawl_month.setSelectedIndex(0);
                                        withdrawl_day.setSelectedIndex(0);
                                        JOptionPane.showMessageDialog(frame, "Withdraw Successful !\n\nWithdrew Amount :"+ withdrawlAmount + "\nDate of Withdrawl: "+ withdrawlDate + "\nPIN Number: " + pinNumber + "\nRemaining Balance: "+debitObject.getbalanceamount(), "Information", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                        
                                    }
                                    
                                    else{
                                        JOptionPane.showMessageDialog(frame, "Insufficient Balance ! You have only Rs. "+debitObject.getbalanceamount(), "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else{
                                        JOptionPane.showMessageDialog(frame, "Invalid PIN Number !", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            else{
                                withdrawflag = false;   
                            }  
                        }
                        
                    }
                    if (withdrawflag ==false){
                        JOptionPane.showMessageDialog(frame, "Invalid Card ID !", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NumberFormatException numex){
                    JOptionPane.showMessageDialog(frame, "Invalid input. Check again and fillup valid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        
        
        //setting credit limit on button click
        else if(a.getSource()==setcreditlimit){
            if(TFcardid4.getText().isEmpty() || TFgraceperiod.getText().isEmpty() || TFcreditlimit.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please fill up the all required fields", "Error", JOptionPane.ERROR_MESSAGE);
                }
            else{
                try{
                    int gracePeriod = Integer.parseInt(TFgraceperiod.getText());
                    int CardId = Integer.parseInt(TFcardid4.getText());
                    double creditLimit = Double.parseDouble(TFcreditlimit.getText());
                    boolean setflag = false;
                    for (BankCard eachCredit: bankcards){
                        if (eachCredit instanceof CreditCard){
                            CreditCard creditObject = (CreditCard) eachCredit;   //downcasting
                            if (CardId == creditObject.getcardID()){
                                if (creditLimit <= 2.5*creditObject.getbalanceamount()){
                                    creditObject.setcreditlimit(creditLimit, gracePeriod);
                                    TFgraceperiod.setText("");
                                    TFcardid4.setText("");
                                    TFcreditlimit.setText("");
                                    JOptionPane.showMessageDialog(frame, "Credit Limit set successfully.\n\n Card ID: "+CardId+"\nGrace Period: "+gracePeriod+ "\nCredit Limit: Rs. "+creditLimit,"Information",JOptionPane.INFORMATION_MESSAGE);
                                    setflag = true;
                                    break;
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "Credit Limit is too high. Your Balance Amount is Rs. "+creditObject.getbalanceamount()+ "Please Enter less than Rs. "+2.5*creditObject.getbalanceamount(), "Error", JOptionPane.ERROR_MESSAGE);
                                }
                                
                            }
                            else{
                                setflag = false;    
                            }
                        }
                    }
                    if (setflag == false){
                    JOptionPane.showMessageDialog(frame, "Invalid Card ID !", "Error", JOptionPane.ERROR_MESSAGE);
                }
                    
                }catch(NumberFormatException numex){
                    JOptionPane.showMessageDialog(frame, "Invalid input. Check again and fillup valid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        
        //function to cancel credit card
        else if(a.getSource()==cancelcreditcard){
            if(TFcardid2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please enter the card ID", "Error", JOptionPane.ERROR_MESSAGE);
                }
            else{
                try{
                    int CardId = Integer.parseInt(TFcardid2.getText());
                    boolean cancelflag = false;
                    for (BankCard eachCredit : bankcards){
                        if (eachCredit instanceof CreditCard){
                           CreditCard creditObject = (CreditCard) eachCredit;   //downcasting
                           if (CardId == creditObject.getcardID()) {
                                creditObject.cancelcreditcard();
                                TFcardid2.setText("");
                                JOptionPane.showMessageDialog(frame, "Credit Card cancelled successfully for Card ID "+CardId, "Information", JOptionPane.INFORMATION_MESSAGE);
                                cancelflag = true;
                                break;
                        }
                        else{
                                cancelflag = false;    
                            }
                    }  
                }
                if (cancelflag == false){
                    JOptionPane.showMessageDialog(frame, "Invalid Card ID !", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException numex){
                    JOptionPane.showMessageDialog(frame, "Invalid input. Check again and fillup valid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        
        // to set all textfields empty and all selected value to default
        else if(a.getSource()==clear){
            TFcardid1.setText("");
            TFcardid2.setText("");
            TFcardid3.setText("");
            TFcardid4.setText("");
            TFclientname.setText("");
            TFissuerbank.setText("");
            TFbankaccount.setText("");
            TFbalanceamount.setText("");    
            TFwithdrawlamount.setText("");
            TFpinno1.setText("");
            TFpinno2.setText("");
            TFgraceperiod.setText("");
            TFcvcnumber.setText("");
            TFinterestrate.setText("");
            TFcreditlimit.setText("");
            TFgraceperiod.setText("");
            expire_year.setSelectedIndex(0);
            expire_month.setSelectedIndex(0);
            expire_day.setSelectedIndex(0);
            withdrawl_year.setSelectedIndex(0);
            withdrawl_month.setSelectedIndex(0);
            withdrawl_day.setSelectedIndex(0);
            
    
        }
        //display debit card details by calling previous display method
        else if(a.getSource()==displaycredit){
            for (BankCard eachCredit : bankcards){
                if (eachCredit instanceof CreditCard){
                    CreditCard creditObject = (CreditCard) eachCredit;   //downcasting
                    creditObject.display();
                }
            }
        }
        //display credit card details by calling previous display method
        else if(a.getSource()==displaydebit){
            for (BankCard eachDebit : bankcards){
                if (eachDebit instanceof DebitCard){
                    DebitCard debitObject = (DebitCard) eachDebit;   //downcasting
                    debitObject.display();
                }
            }
        }
    }
   //main method for main object creation of BankGUI class
   public static void main(String [] args){
       new BankGUI();
   }
}
