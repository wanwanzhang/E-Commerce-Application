/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SecurityManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Wanwan Zhang
 */
public class SecurityManageOrganization extends Organization{
     public SecurityManageOrganization() {
        super(Organization.Type.SecurityManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SecurityManagerRole());
        return roles;
    }
}
