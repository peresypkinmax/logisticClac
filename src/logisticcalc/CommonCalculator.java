/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc;

import java.math.RoundingMode;

/**
 *
 * @author макс
 */
public abstract class CommonCalculator {
   
    /**
     * VARS
     */
    
    protected int qty;              // количество штук товара
    protected Double fob;           // цена штуки товара
    
    protected Double lengthPack;    // длинна упаковки
    protected Double heightPack;    // ширина упаковки
    protected Double widthPack;     // высота упаковки
    protected Double valuePack;     // объем упаковки  V=L*W*H/1000000
    
    protected Double pkgs;          // вес упаковки с товаром

    protected int pcs;              // количество товара в упаковке
    
    /**
     * Расчетные показатели
     */
    
    protected Double fobQuatr;      // цена штуки товара с учетом услуг Quatra
    
    protected int qoc;              // количество грузовых мест
    
    protected Double totalValuePack;// общий объем
    
    protected Double totalGWeight;  // общий вес брутто
    protected Double valueWeight;   // объемный вес
    
    protected int ktk40Ship;     // количество отгрузок 40 футовым контейнером
    protected int ktk20Ship;     //  количество отгрузок 20 футовым контейнером
    
    /**
     * CONSTANTS
     */
    protected final Double TAX_RFN = 0.15;     // коэффициент возврата налогового сбора
    protected final int MAX_VKTK40 = 68;       // максимальный допустимый объем для 40 футового контейнера
    protected final int MAX_VKTK20 = 25;       // максимальный допустимый объем для 20 футового контейнера
    protected final int MAX_WKTK40 = 27000;    // максимальный допустимый вес для 40 футового контейнера
    protected final int MAX_WKTK20 = 20000;    // максимальный допустимый вес для 20 футового контейнера
    protected final int MIN_WAUTO = 50;        // минимальный допустимый вес для перевозки автотранспортом
    protected final int INSP_RATE = 1000;      // ставка услуг инспекции
    protected final Double INSUR_RATE = 0.1;   // ставка услуг страхования

   
    /**
     * CALC METHODS
     */
    
   /**
    * цена штуки товара с учетом услуг Quatra
    * @return 
    */
    public Double calcFOBQuatr() {
        if (qty*fob>100000){
            return fob*1.05;
        }else{
            return fob*1.1;
        }
    }

  
    public int calcQOC() {
        return Math.round((qty / pcs)+0.5f);
    }

   
    public Double calcTotalValuePack() {
        return pcs * valuePack;
    }

   
    public Double calcTotalGWeight() {
        return calcQOC() * pkgs;
    }

  
    public Double calcValueWeight() {
        if (calcTotalGWeight()/valuePack > 167){
            return 167.0;
        }else{
            return valuePack*167;
        }
    }

   
    public int calcKTK40Ship() {
        int a,b;
        a = (int)Math.round((valuePack/MAX_VKTK40) + 0.5f);
        b = (int)Math.round((calcTotalGWeight()/MAX_VKTK40) + 0.5f);
        if (a>b){
            return a;
        }else{
            return b;
            }      
    }

   
    public int calcKTK20Ship() {
        int a,b;
        a = (int)Math.round((valuePack/MAX_VKTK20) + 0.5f);
        b = (int)Math.round((calcTotalGWeight()/MAX_VKTK20) + 0.5f);
        if (a>b){
            return a;
        }else{
            return b;
            }     
    }       
    
      
    /**
     * GETTER AND SETTER SECTION
     */
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getFob() {
        return fob;
    }

    public void setFob(Double fob) {
        this.fob = fob;
    }

    public Double getLengthPack() {
        return lengthPack;
    }

    public void setLengthPack(Double lengthPack) {
        this.lengthPack = lengthPack;
    }

    public Double getHeightPack() {
        return heightPack;
    }

    public void setHeightPack(Double heightPack) {
        this.heightPack = heightPack;
    }

    public Double getWidthPack() {
        return widthPack;
    }

    public void setWidthPack(Double widthPack) {
        this.widthPack = widthPack;
    }

    public Double getValuePack() {
        return valuePack;
    }

    public void setValuePack(Double valuePack) {
        this.valuePack = valuePack;
    }

    public Double getPkgs() {
        return pkgs;
    }

    public void setPkgs(Double pkgs) {
        this.pkgs = pkgs;
    }

    public int getPcs() {
        return pcs;
    }

    public void setPcs(int pcs) {
        this.pcs = pcs;
    }

    public Double getFobQuatr() {
        return fobQuatr;
    }

    public void setFobQuatr(Double fobQuatr) {
        this.fobQuatr = fobQuatr;
    }

    public int getQoc() {
        return qoc;
    }

    public void setQoc(int qoc) {
        this.qoc = qoc;
    }

    public Double getTotalValuePack() {
        return totalValuePack;
    }

    public void setTotalValuePack(Double totalValuePack) {
        this.totalValuePack = totalValuePack;
    }

    public Double getTotalGWeight() {
        return totalGWeight;
    }

    public void setTotalGWeight(Double totalGWeight) {
        this.totalGWeight = totalGWeight;
    }

    public Double getValueWeight() {
        return valueWeight;
    }

    public void setValueWeight(Double valueWeight) {
        this.valueWeight = valueWeight;
    }

    public int getKtk40Ship() {
        return ktk40Ship;
    }

    public void setKtk40Ship(int ktk40Ship) {
        this.ktk40Ship = ktk40Ship;
    }

    public int getKtk20Ship() {
        return ktk20Ship;
    }

    public void setKtk20Ship(int ktk20Ship) {
        this.ktk20Ship = ktk20Ship;
    }

    public Double getTAX_RFN() {
        return TAX_RFN;
    }

    public int getMAX_VKTK40() {
        return MAX_VKTK40;
    }

    public int getMAX_VKTK20() {
        return MAX_VKTK20;
    }

    public int getMAX_WKTK40() {
        return MAX_WKTK40;
    }

    public int getMAX_WKTK20() {
        return MAX_WKTK20;
    }

    public int getMIN_WAUTO() {
        return MIN_WAUTO;
    }

    public int getINSP_RATE() {
        return INSP_RATE;
    }

    public Double getINSUR_RATE() {
        return INSUR_RATE;
    }
    
    
    
    
}
