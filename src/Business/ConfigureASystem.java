package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.business.Customer;
import Business.business.Product;
import Business.business.Salesperson;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount uaa = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
     //   
        
     
        
        Salesperson sp1 = system.getSalespersonlist().addSalesperson();
        sp1.setFirstname("Sales1");
        sp1.setLastname("Sales1");
        sp1.setOrgnization("NEU");
        UserAccount ua1 = system.getUserAccountDirectory().addUserAccount();
        ua1.setIsactive("Yes");
        ua1.setUsername("sales1");
        ua1.setPassword("sales1");
        ua1.setPerson(sp1);
       
        ua1.setStringrole(UserAccount.SALESPERSON_ROLE);
        
        Salesperson sp2 = system.getSalespersonlist().addSalesperson();
        sp2.setFirstname("Sales2");
        sp2.setLastname("Sales2");
        sp2.setOrgnization("NEU");
        UserAccount ua5 = system.getUserAccountDirectory().addUserAccount();
        ua5.setIsactive("Yes");
        ua5.setUsername("sales2");
        ua5.setPassword("sales2");
        ua5.setPerson(sp2);
        ua5.setStringrole(UserAccount.SALESPERSON_ROLE);
        
         Salesperson sp3 = system.getSalespersonlist().addSalesperson();
        sp3.setFirstname("Sales3");
        sp3.setLastname("Sales3");
        sp3.setOrgnization("NEU");
        UserAccount ua6 = system.getUserAccountDirectory().addUserAccount();
        ua6.setIsactive("Yes");
        ua6.setUsername("sales3");
        ua6.setPassword("sales3");
        ua6.setPerson(sp3);
        ua6.setStringrole(UserAccount.SALESPERSON_ROLE);
        
        Customer c1 = system.getCustomercatalog().addCustomer();
        c1.setFirstname("cust1");
        c1.setLastname("cust1");        
         UserAccount ua3 = system.getUserAccountDirectory().addUserAccount();
        ua3.setIsactive("Yes");
        ua3.setUsername("cust1");
        ua3.setPassword("cust1");
        ua3.setPerson(c1);
        ua3.setStringrole(UserAccount.CUSTOMER_ROLE);
        
        
        Customer c2 = system.getCustomercatalog().addCustomer();
        c2.setFirstname("cust2");
        c2.setLastname("cust2");       
         UserAccount ua4 = system.getUserAccountDirectory().addUserAccount();
        ua4.setIsactive("Yes");
        ua4.setUsername("cust2");
        ua4.setPassword("cust2");
        ua4.setPerson(c2);
        ua4.setStringrole(UserAccount.CUSTOMER_ROLE);
        
        Customer c3 = system.getCustomercatalog().addCustomer();
        c3.setFirstname("cust3");
        c3.setLastname("cust3");        
         UserAccount ua7 = system.getUserAccountDirectory().addUserAccount();
        ua7.setIsactive("Yes");
        ua7.setUsername("cust3");
        ua7.setPassword("cust3");
        ua7.setPerson(c3);
        ua7.setStringrole(UserAccount.CUSTOMER_ROLE);
        
        Product p1 = system.getProductcatalog().addProduct();
        p1.setProductname("A");     
        p1.setFloorprice(20);
        p1.setTargetprice(30);
        p1.setListprice(35);
        p1.setCeilingprice(40);
        p1.setOriginalavail(1000);
        p1.setAvail(1000);
        
        Product p2 = system.getProductcatalog().addProduct();
        p2.setProductname("B");     
        p2.setFloorprice(30);
        p2.setTargetprice(40);
        p2.setListprice(45);
        p2.setCeilingprice(50);
        p2.setOriginalavail(1000);
        p2.setAvail(1000);
        return system;
        

    
    }
    
}
