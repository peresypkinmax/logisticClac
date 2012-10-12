/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc.util.persist;

/**
 *
 * @author макс
 */
public class FreightAirCost {
    long costID;
    String fromCountry;
    long fromWieght;
    long toWeight;
    Double cost;


    
    /**
     * GETTER AND SETTER SECTION
     */
    
    public long getCostID() {
        return costID;
    }

    public void setCostID(long costID) {
        this.costID = costID;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public long getFromWieght() {
        return fromWieght;
    }

    public void setFromWieght(long fromWieght) {
        this.fromWieght = fromWieght;
    }

    public long getToWeight() {
        return toWeight;
    }

    public void setToWeight(long toWeight) {
        this.toWeight = toWeight;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    } 
    
}
