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
public class RiskList {
   private ArrayList<Risk> riskList;
    
    public RiskList (){ 
        riskList  = new ArrayList<>();
    }
     public void addRisk(Risk ua){
        
        riskList.add(ua);
        
    }

    public ArrayList<Risk> getRiskList() {
        return riskList;
    }

    public void setRiskList(ArrayList<Risk> riskList) {
        this.riskList = riskList;
    }
    
}
