 public class BankAccount {
     private String accountNumber;
     private double balance;
     public String ownerName;
     public BankAccount(String accountNumber, String ownerName) {
         this.accountNumber = accountNumber;
         this.ownerName = ownerName;
         this.balance = 0;
     }
     public BankAccount(String accountNumber, String ownerName, double balance){
         if (balance < 0) {
             balance = 0;
             System.out.println("Error");
         }
     }
     public void deposit(double amount) {
         if ( amount >0){
             balance += amount;
         }
     }
     public boolean withdraw(double amount) {
         if (amount > 0 && amount <= balance) {
             balance -= amount;
             return true;
         } else {
             return false;
         }
     }
     private double getBalance() {
         return balance;
     }
     public static void main(String[] args) {
         BankAccount s = new BankAccount("25023179", "Buoi", -45);
         s.deposit(-2500);
         s.withdraw(1000);
         System.out.println(s.getBalance());
     }
 }
