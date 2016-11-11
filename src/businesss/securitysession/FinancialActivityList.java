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
public class FinancialActivityList {
    
    private ArrayList<FinancialActivity> financialActivityList;
    
    public FinancialActivityList (){ 
        financialActivityList  = new ArrayList<>();
    }

    public ArrayList<FinancialActivity> getFinancialActivityList() {
        return financialActivityList;
    }

    public void setFinancialActivityList(ArrayList<FinancialActivity> financialActivityList) {
        this.financialActivityList = financialActivityList;
    }
    public FinancialActivity addFinancialActivity(){
        FinancialActivity ua = new FinancialActivity();
        financialActivityList.add(ua);
        return ua;
    }
}
