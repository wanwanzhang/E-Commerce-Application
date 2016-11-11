/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.Organization.SecurityExcutiveOrganization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.SercurityExcutiveRole.SecurityExcutiveWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SecurityExcutiveRole extends Role {
   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SecurityExcutiveWorkAreaJPanel(userProcessContainer, account, (SecurityExcutiveOrganization)organization,enterprise, business);
    }
    
}
