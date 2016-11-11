/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Financial.getValue())){
            organization = new FinancialOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SecurityExcutive.getValue())){
            organization = new SecurityExcutiveOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SecurityService.getValue())){
            organization = new SecurityServiceOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}