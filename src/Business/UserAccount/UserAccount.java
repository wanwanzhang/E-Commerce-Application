/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import Business.business.Customer;
import Business.business.Person;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Customer customer;
    private Role role;
    private WorkQueue workQueue;
    public static final String CUSTOMER_ROLE = "customerrole";
    public static final String SALESPERSON_ROLE = "salespersonrole";
    

    private static int count = 1000;
    private int userid;

   
    private String stringrole="";

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStringrole() {
        return stringrole;
    }

    public void setStringrole(String stringrole) {
        this.stringrole = stringrole;
    }
    private Person person;
    private String isactive;
    public UserAccount() {
        workQueue = new WorkQueue();userid = ++count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }
    
      
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}