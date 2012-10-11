/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc;

/**
 *
 * @author макс
 */
public class LogisticCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CommonCalculator cc = new FastMethodCalculator();
        cc.setQty(19);
        cc.setFob(4.4);
        cc.setHeightPack(1.0);
        cc.setWidthPack(1.0);
        cc.setLengthPack(1.0);
        cc.setValuePack(3.0);
        cc.setPkgs(10.1);
        cc.setPcs(20);
        System.out.println("Цена штуки с учетом услуг "+cc.calcFOBQuatr());
        System.out.println("Количество грузовых мест "+cc.calcQOC());
        System.out.println("Общий объем "+cc.calcTotalValuePack());
        System.out.println("Общий вес брутто "+cc.calcTotalGWeight());
        System.out.println("Объемный вес "+cc.calcValueWeight());
        System.out.println("Количество отргузок 40 фут. контейнером "+cc.calcKTK40Ship());
        System.out.println("Количество отргузок 20 фут. контейнером "+cc.calcKTK40Ship());
    }
}
