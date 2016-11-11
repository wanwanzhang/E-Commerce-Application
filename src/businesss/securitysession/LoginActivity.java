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
public class LoginActivity {
    private int activitynumber; 
    private Date logintime; 
  
    private String description; 
     private static int count ;
      private UserAccount userAccount; 
   private String Doubtbyexcutive; 

    public String getDoubtbyexcutive() {
        return Doubtbyexcutive;
    }

    public void setDoubtbyexcutive(String Doubtbyexcutive) {
        this.Doubtbyexcutive = Doubtbyexcutive;
    }
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
     public LoginActivity(){
         activitynumber = count ++;
         logintime= new Date();
     }

    public int getActivitynumber() {
        return activitynumber;
    }

    public void setActivitynumber(int activitynumber) {
        this.activitynumber = activitynumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        LoginActivity.count = count;
    }
    

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

 
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
      @Override 
    public String toString(){
        return String.valueOf(activitynumber);
    }
}
