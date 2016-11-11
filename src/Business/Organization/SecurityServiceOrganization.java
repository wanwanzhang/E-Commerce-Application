/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SecurityExcutiveRole;
import Business.Role.Role;
import Business.Role.SecurityServiceRole;
import java.util.ArrayList;

/**
 *
 * @author Wanwan Zhang
 */
public class SecurityServiceOrganization extends Organization {
       public SecurityServiceOrganization() {
        super(Organization.Type.SecurityService.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SecurityServiceRole());
        return roles;
    }
}
