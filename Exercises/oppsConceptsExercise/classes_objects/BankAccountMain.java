package oppsConceptsExercise.classes_objects;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount abhayAccount = new BankAccount();
        abhayAccount.setAccountName("Abhay Kushwaha");
        abhayAccount.setAccountNumber("61310015");
        abhayAccount.setPhoneNo(99369l);
        abhayAccount.deposit(200);
        // abhayAccount.withdraw(-200);
        abhayAccount.withdraw(100);
        abhayAccount.displayDetails();
    }
}
