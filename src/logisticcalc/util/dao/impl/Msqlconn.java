/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticcalc.util.dao.impl;
import java.sql.*;
import java.util.*;
import logisticcalc.util.persist.FreightAirCost;

/**
 *
 * @author макс
 */
public class Msqlconn {
    /**
     * @param args the command line arguments
     */
    public String usrname;
    public String pwd;
    public String url;
    private Connection conn=null;

    /**
     * 
     * @param args
     */
    public Msqlconn (String usrname, String pwd, String url)
            {
                this.usrname = usrname;
                this.pwd     = pwd;
                this.url     = url; 
                this.conn    = null;
        try
        {
            System.out.println(usrname);
            System.out.println(pwd);
            System.out.println(url);
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver (new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection (url,usrname,pwd);
            this.conn = conn;
            //Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/logisticcalc","root","root");
            System.out.println("Connection is established");            
        }
            catch(Exception e)
            {
                System.err.println("Connection failed");
                e.printStackTrace();                
            }
            finally
            {
                //if (conn!=null){try{conn.close(); System.out.println("Connection finished");}catch(Exception e){}}
            }
            }
    // getter section
    public String getusrname()
    {    return usrname;    }
    
    public String getpwd()
    {    return pwd;    }
    
    public String geturl()
    {    return url;    }
    
    // Вставка в таблицу
    public boolean minsert(String sql)
    {
        try{
            Statement st = conn.createStatement();
            st.executeUpdate(sql); 
            return true;                    
           }
           catch(SQLException e)
           {
             e.printStackTrace();
             return false;
           }
        finally{}          
    }
    // Вставка в таблицу конец
   
   
    public List<FreightAirCost> mquery(String sql)
    {
        List<FreightAirCost> facList= new ArrayList<FreightAirCost>(5);
        try{
            
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          //rs.first();
          while(rs.next())
          {           
              FreightAirCost fac = new FreightAirCost();
              fac.setCostID(rs.getInt(1));
              fac.setFromCountry(rs.getString(2));
              fac.setFromWieght(rs.getLong(3));
              fac.setToWeight(rs.getLong(4));
              fac.setCost(rs.getDouble(5));          
              facList.add(fac);
          } 
          return facList;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return new ArrayList<FreightAirCost>(0);
        }
        finally{}
        
    }
}
