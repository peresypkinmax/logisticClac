/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc;

/**
 *
 * @author макс
 */
public class FastMethodCalculator extends CommonCalculator{

    /**
     * VARS
     */
    
    int aShip;      // количество авиотгрузок
    Double aFRCost; // стоимость авиадоставки
    Double docCost;  // стоимость экспортных документов
    
    /**
     * CONSTANTS
     */
    final int MAX_AVIA_VALUE = 20; // максимальный допустимый объем для авиаперевозки 
    final Double ASHIP_DOC = 250.0;     // ставка оформления экспортной документации на 1 авиарейс


    
    /**
 * METHODS
 */

    /**
     * Количество авиаотгрузок
     * @return 
     */
    public int calcAShip(){
        return (int)Math.round((valuePack/MAX_AVIA_VALUE)+0.5f);
    }
    
    /**
     * стоимость авиа доставки
     * @return 
     */
    public Double calcAFRCost(){
        return (currentFrKGSCost+1)*valueWeight;
    }
    
    
    /**
     * стоимость экспортных документов
     */

    public Double calcDocCost(){
        return calcAShip()*ASHIP_DOC;
    }
/**
 * GETTER AND SETTER SECTION
 */
    public int getaShip() {
        return aShip;
    }

    public void setaShip(int aShip) {
        this.aShip = aShip;
    }

    public Double getaFRCost() {
        return aFRCost;
    }

    public void setaFRCost(Double aFRCost) {
        this.aFRCost = aFRCost;
    }

    public Double getDocCost() {
        return docCost;
    }

    public void setDocCost(Double docCost) {
        this.docCost = docCost;
    }

    public int getMAX_AVIA_VALUE() {
        return MAX_AVIA_VALUE;
    }

    public Double getASHIP_DOC() {
        return ASHIP_DOC;
    }


  

    
    
    
}


