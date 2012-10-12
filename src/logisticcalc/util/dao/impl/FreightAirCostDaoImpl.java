/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc.util.dao.impl;

import java.util.List;
import logisticcalc.util.dao.FreightAirCostDao;
import logisticcalc.util.persist.FreightAirCost;

/**
 *
 * @author макс
 */
public class FreightAirCostDaoImpl implements FreightAirCostDao{
    
    Msqlconn msqlconn;
    
    
    /**
     * CONSTRUCTOR
     */
    public FreightAirCostDaoImpl(){
        this.msqlconn = new Msqlconn("root","root","jdbc:mysql://localhost:3306/logisticcalc");
    }    

    @Override
    public List<FreightAirCost> findAllItems() {
        return msqlconn.mquery("select * from freightaircost");
    }

    @Override
    public List<FreightAirCost> findItemsByCountry(String country) {
        return msqlconn.mquery("select * from freightaircost where fromCountry='"+country+"'");
    }

    @Override
    public void saveOrUpdateItem(FreightAirCost freightAirCost) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addItem(FreightAirCost freightAirCost) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
