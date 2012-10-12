/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc;

/**
 *
 * @author макс
 */
public class EverageMethodCalculator extends CommonCalculator{

    /**
     * CONSTANTS
     */
    
    final Double VW_CH_COST      = 1.0;    // ставка перевозки единицы объемного груза по Китаю
    final Double RVW_RU_COST     = 1.0;    // ставка перевозки единицы объемного груза по России по ЖД
    final Double AVW_RU_COST     = 3.0;    // ставка перевозки единицы объемного груза по России авиатранспортом
    final Double C_PACK          = 4.7;    // ставка переупаковки грузового места
    final Double STOR            = 25.0;   // ставка хранения единицы грузового места
    final Double B_SHIP_DOC      = 220.0;  // ставка оформления экспортной документации при среднем методе доставки
    final Double SFR_KTK_20_COST = 1500.0; // ставка фрахта контейнера 20 футов до Владивостока
    final Double SFR_KTK_40_COST = 2200.0; // ставка фрахта контейнера 20 футов до Владивостока


    /**
     * GETTER AND SETTER SECTION
     */
   
        public Double getVW_CH_COST() {
        return VW_CH_COST;
    }

    public Double getRVW_RU_COST() {
        return RVW_RU_COST;
    }

    public Double getAVW_RU_COST() {
        return AVW_RU_COST;
    }

    public Double getC_PACK() {
        return C_PACK;
    }

    public Double getSTOR() {
        return STOR;
    }

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
