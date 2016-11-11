/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesss.securitysession;

import java.util.ArrayList;

/**
 *
 * @author Wanwan Zhang
 */
public class LoginActivityList {
    private ArrayList<LoginActivity> loginActivityList;
    
    public LoginActivityList(){
        loginActivityList = new ArrayList<>();
    }

    public ArrayList<LoginActivity> getLoginActivityList() {
        return loginActivityList;
    }

    public void setLoginActivityList(ArrayList<LoginActivity> loginActivityList) {
        this.loginActivityList = loginActivityList;
    }

 
     public LoginActivity addLoginActivity(){
        LoginActivity ua = new LoginActivity();
        loginActivityList.add(ua);
        return ua;
    }
}
