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
    Double doCost;  // стоимость экспортных документов
    
    /**
     * CONSTANTS
     */
    int MAX_AVIA_VALUE = 20; // максимальный допустимый объем для авиаперевозки 
    int ASHIP_DOC = 250;     // ставка оформления экспортной документации на 1 авиарейс
}
