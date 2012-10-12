/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc;

import java.util.Iterator;
import logisticcalc.util.bl.FreightAirCostInterface;
import logisticcalc.util.bl.impl.FreightAirCostInterfaceImpl;
import logisticcalc.util.persist.FreightAirCost;
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
        
        FreightAirCostInterface faci = new FreightAirCostInterfaceImpl();
         
        
        System.out.println("--------------------------------------");
        Iterator itr = faci.findAllItems().listIterator();
          while (itr.hasNext()){
              Object element = itr.next();
                    
              Class<? extends FreightAirCost>  ss;          
              ss = (Class<? extends FreightAirCost>) element.getClass();
              System.out.println(ss.cast(element).getFromCountry()+" from "+ss.cast(element).getFromWieght()+" to "+ss.cast(element).getToWeight()+" - "+ss.cast(element).getCost()+" $");              
          }  
          System.out.println("--------------------------------------");
          Iterator itr1 = faci.findItemsByCountry("HongKong").listIterator();
          while (itr1.hasNext()){
              Object element = itr1.next();
                    
              Class<? extends FreightAirCost>  ss;          
              ss = (Class<? extends FreightAirCost>) element.getClass();
              System.out.println(ss.cast(element).getFromCountry()+" from "+ss.cast(element).getFromWieght()+" to "+ss.cast(element).getToWeight()+" - "+ss.cast(element).getCost()+" $");              
          }
    }
}
