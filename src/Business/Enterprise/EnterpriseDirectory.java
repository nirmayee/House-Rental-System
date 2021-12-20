/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }
    
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (null != type) {
            switch (type) {
                case MaintenanceProvider:
                    enterprise = new MaintenanceProviderEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case Asset:
                    enterprise = new AssetEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case Broker:
                    enterprise = new BrokerEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case QualityControl:
                    enterprise = new QualityControlEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                default:
                    break;
            }
        }
        return enterprise;
    }
    
}
