/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc.util.bl;

import java.util.List;
import logisticcalc.util.persist.FreightAirCost;

/**
 *
 * @author макс
 */
public interface FreightAirCostInterface {
    
    public List<FreightAirCost> findAllItems();
    public List<FreightAirCost> findItemsByCountry(String country);
    public void saveOrUpdateItem(FreightAirCost freightAirCost);
    public void addItem(FreightAirCost freightAirCost);
    
}
