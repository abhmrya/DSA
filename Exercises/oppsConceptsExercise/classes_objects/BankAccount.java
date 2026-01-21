package oppsConceptsExercise.classes_objects;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNumber;

    public void deposit(double byHowMuch){
        if(byHowMuch>0){
        this.balance+=byHowMuch;
        System.out.println("deposite Rs."+byHowMuch+"\nCurrent balance is : "+this.balance+"\n");
        }else{
            System.out.println("This account entered.please try again.");
        }
    }
    public void withdraw(double byHowMuch){
        if(byHowMuch>=0){
            if(this.balance-byHowMuch>=0){
            this.balance-=byHowMuch;
            System.out.println("HOw much money withdraw"+byHowMuch+"\ncunnent balance is: "+this.balance+"\n");
            }else{
                System.out.println("insufficient funds. you have Rs."+this.balance+" in your account\n");
        }
        }else{
            System.out.println("Invalid amont enter. plasee try again.");
        }
        
    }
    public void setAccountNumber(String accoountNumber){
        this.accountNumber=accoountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public String getAccountName(){
        return accountName;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setPhoneNo(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNo(){
        return phoneNumber;
    }
    public void displayDetails(){
        System.out.println("Account holder name: "+this.accountName);
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Phone No: "+this.phoneNumber);
        System.out.println("Current Balance is:"+this.balance);

    }
}
