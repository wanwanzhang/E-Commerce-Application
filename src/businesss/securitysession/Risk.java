/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesss.securitysession;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Wanwan Zhang
 */
public class Risk {
      private int risklevel; 
      private int risknumber; 
      private static int count; 
      private FinancialActivity financialactivity; 
      private LoginActivity loginactivity; 
      private Date risktime; 
      UserAccount userAccount ;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Date getRisktime() {
        return risktime;
    }

    public void setRisktime(Date risktime) {
        this.risktime = risktime;
    }
      

    public int getRisknumber() {
        return risknumber;
    }

    public void setRisknumber(int risknumber) {
        this.risknumber = risknumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Risk.count = count;
    }
      
public Risk () { 
    risknumber = count++;
}
    public FinancialActivity getFinancialactivity() {
        return financialactivity;
    }

    public void setFinancialactivity(FinancialActivity financialactivity) {
        this.financialactivity = financialactivity;
    }

    public LoginActivity getLoginactivity() {
        return loginactivity;
    }

    public void setLoginactivity(LoginActivity loginactivity) {
        this.loginactivity = loginactivity;
    }

    public int getRisklevel() {
        return risklevel;
    }

    public void setRisklevel(int risklevel) {
        this.risklevel = risklevel;
    }
       @Override 
    public String toString(){
        return String.valueOf(risknumber);
    }
}
