package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;
import Business.business.CustomerCatalog;
import Business.business.MasterOrderCatalog;
import Business.business.ProductCatalog;
import Business.business.SalespersonDirectory;
import businesss.securitysession.FinancialActivityList;
import businesss.securitysession.LoginActivityList;
import businesss.securitysession.RiskList;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private CustomerCatalog customercatalog;
    private ProductCatalog productcatalog;
    private SalespersonDirectory salespersonlist;
    private FinancialActivityList financialActivityList;
    private LoginActivityList loginActivityList;
    private RiskList risklist;

    //private static Business business;
    private MasterOrderCatalog masterordercatalog;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        customercatalog = new CustomerCatalog();
        masterordercatalog = new MasterOrderCatalog();
        productcatalog = new ProductCatalog();
        salespersonlist = new SalespersonDirectory();
        financialActivityList = new FinancialActivityList();
        loginActivityList = new LoginActivityList();
        risklist = new RiskList();
    }

    public RiskList getRisklist() {
        return risklist;
    }

    public void setRisklist(RiskList risklist) {
        this.risklist = risklist;
    }

    public FinancialActivityList getFinancialActivityList() {
        return financialActivityList;
    }

    public void setFinancialActivityList(FinancialActivityList financialActivityList) {
        this.financialActivityList = financialActivityList;
    }

    public LoginActivityList getLoginActivityList() {
        return loginActivityList;
    }

    public void setLoginActivityList(LoginActivityList loginActivityList) {
        this.loginActivityList = loginActivityList;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public CustomerCatalog getCustomercatalog() {
        return customercatalog;
    }

    public void setCustomercatalog(CustomerCatalog customercatalog) {
        this.customercatalog = customercatalog;
    }

    public ProductCatalog getProductcatalog() {
        return productcatalog;
    }

    public void setProductcatalog(ProductCatalog productcatalog) {
        this.productcatalog = productcatalog;
    }

    public SalespersonDirectory getSalespersonlist() {
        return salespersonlist;
    }

    public void setSalespersonlist(SalespersonDirectory salespersonlist) {
        this.salespersonlist = salespersonlist;
    }

    public MasterOrderCatalog getMasterordercatalog() {
        return masterordercatalog;
    }

    public void setMasterordercatalog(MasterOrderCatalog masterordercatalog) {
        this.masterordercatalog = masterordercatalog;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {
        }

        return true;
    }
}
