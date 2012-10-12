/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc.util.bl.impl;

import java.util.List;
import logisticcalc.util.bl.FreightAirCostInterface;
import logisticcalc.util.dao.FreightAirCostDao;
import logisticcalc.util.dao.impl.FreightAirCostDaoImpl;
import logisticcalc.util.persist.FreightAirCost;

/**
 *
 * @author макс
 */
public class FreightAirCostInterfaceImpl implements FreightAirCostInterface{

    FreightAirCostDao facd = new FreightAirCostDaoImpl();
    
    
    @Override
    public List<FreightAirCost> findAllItems() {
        return facd.findAllItems();
    }

    @Override
    public List<FreightAirCost> findItemsByCountry(String country) {
        return facd.findItemsByCountry(country);
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
