package com.abhay.constructors;

public class ConstructorIntro {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNumber;

// constucter overloading
// constrocter chaining
    public ConstructorIntro(){  // non Argument constructer
        this("Unknown","Unknown",0.0,1234567890l);
        System.out.println("No argument constrocter is being called");
        // this.accountNumber="Unknown";
        // this.accountName="Unknown";
        // this.balance=0.0;
        // this.phoneNumber=1234567890l;
    }  

   public ConstructorIntro(String accountName,String accountNumber,double balance,long phoneNumber){
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.balance=balance;
        this.phoneNumber=phoneNumber;
        System.out.println("parameterize constructer is being called with 4 argument");
   }

   public ConstructorIntro(String accountName,String accountNumber,double balance){
    this(accountNumber,accountName,balance,78612345678l);
        // this.accountNumber=accountNumber;
        // this.accountName=accountName;
        // this.balance=balance;
   }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void DisplayDetails(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Account Name is: "+accountName);
        System.out.println("Balance is: "+balance);
        System.out.println("Phone number is: "+ phoneNumber);
    }
}
