/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc;

/**
 *
 * @author макс
 */
public class SlowMethodCalculator extends CommonCalculator{
   /**
    * CONSTRUCTORS
    */
    
    final Double B_SHIP_DOC      = 500.0;  // ставка оформления экспортной документации при медленном методе доставки
    final Double SFR_KTK_20_COST = 8000.0; // ставка фрахта контейнера 20 футов до Владивостока
    final Double SFR_KTK_40_COST = 5000.0; // ставка фрахта контейнера 20 футов до Владивостока

    
    /**
     * GETTER AND SETTER METHODS
     */
    public Double getB_SHIP_DOC() {
        return B_SHIP_DOC;
    }

    public Double getSFR_KTK_20_COST() {
        return SFR_KTK_20_COST;
    }

    public Double getSFR_KTK_40_COST() {
        return SFR_KTK_40_COST;
    }
    
}
