package th.ac.kmitl.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        ATM atm = context.getBean(ATM.class);

        String name = atm.validateCustomer(1, 1234);
        System.out.println(name + " has " + atm.getBalance());
        atm.withdraw(200);
        System.out.println(name + " has " + atm.getBalance());

        Bank bank = context.getBean(Bank.class);
        System.out.println(bank.getName());

    }
}
