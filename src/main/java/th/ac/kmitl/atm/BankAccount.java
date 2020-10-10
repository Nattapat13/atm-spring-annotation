package th.ac.kmitl.atm;

public class BankAccount {
   private  int  id;
   private String name;
   private  double balance;

   public BankAccount(int id, String name, double balance) {
      this.id = id;
      this.name = name;
      this.balance = balance;
   }

   public BankAccount(int id, String name) {
      this(id, name, 0);
   }

   public void deposit(double amount){ balance = balance + amount ; }

   public void withdraw(double amount){ balance = balance - amount ; }

   public int getId() { return id; }

   public String getName() { return name; }

   public double getBalance() { return balance; }
}
