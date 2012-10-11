/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc.util.dao;

import logisticcalc.util.persist.FreightAirCost;

/**
 *
 * @author макс
 */
public interface FreightAirCostDao {
    
    public void findAllItems();
    public void findItemsByCountry(String country);
    public void saveOrUpdateItem(FreightAirCost freightAirCost);
    public void addItem(FreightAirCost freightAirCost);
    
}
