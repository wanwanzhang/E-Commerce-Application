/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SecurityExcutiveRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SecurityExcutiveOrganization extends Organization{

    public SecurityExcutiveOrganization() {
        super(Organization.Type.SecurityExcutive.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SecurityExcutiveRole());
        return roles;
    }
     
   
    
    
}
