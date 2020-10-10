package th.ac.kmitl.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Bank {
   private  String name; //attribute

   private Map<Integer,Customer>  Customers ;      //composition
   private DataSource dataSource;                  //composition

   @Autowired
   public Bank(@Value("${bankname}") String name , DataSource dataSource ) {
      this.name = name;
      this.dataSource= dataSource;
      this.Customers =  dataSource.readCustomers();
   }

   public  void registerCustomer(Customer customer ){ Customers.put(customer.getId(),customer); }

   public Customer findCustomer(int id){ return Customers.get(id); }

   public String getName() { return name; }
}