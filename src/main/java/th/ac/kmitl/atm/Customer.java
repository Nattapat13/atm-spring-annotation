package th.ac.kmitl.atm;

public class Customer {
   //attribute
   private  int id;
   private  String name ;
   private int pin ;

   //composition
   private BankAccount account;

   public Customer(int id, String name, int pin) {
      this(id, name,pin,0);
   }
   public Customer(int id, String name, int pin , double balance ) {
      this.id = id;
      this.name = name;
      this.pin = pin;
      this.account = new BankAccount(id, name, balance);
   }

   public boolean checkPin(int inputPin){ return  pin == inputPin ; }

   public int getId() { return id; }

   public String getName() { return name; }

   public BankAccount getAccount() { return account; }

   public void setName(String name) { this.name = name; }
}