/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FinancialOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.FinancialRole.FinancialWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class FinancialRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FinancialWorkAreaJPanel(userProcessContainer, account, (FinancialOrganization)organization, enterprise,business);
    }
    
    
}
