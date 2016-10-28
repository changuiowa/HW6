
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Products;


public class ReadQuery {
  
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
    
        
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }
    
    
    public void doRead(){
    
        try {
            String query = "Select * from PRODUCTS ORDER BY productID ASC";
            PreparedStatement ps = conn.prepareStatement(query);    
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }            
    
    public String getHTMLtable() {
        
        String table = "";
       
        table += "<table class = \"list\">";
        
        try {
            while(this.results.next()){
                
                Products products = new Products();
                products.setProductID(this.results.getInt("productID"));
                products.setProductName(this.results.getString("productName"));
                products.setPrice(this.results.getInt("price"));
                products.setQuantity(this.results.getInt("quantity"));
                products.setCompany(this.results.getString("company"));
                
                table += "<tr>";
                
                table += "<td>";
                table += products.getProductID();
                table += "</td>";
                
                table += "<td>";
                table += products.getProductName();
                table += "</td>";
                
                table += "<td>";
                table += products.getPrice();
                table += "</td>";
                
                table += "<td>";
                table += products.getQuantity();
                table += "</td>";
                
                table += "<td>";
                table += products.getCompany();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=update?productID=" + products.getProductID() + "> Update</a>" + " " +"<a href=delete?productID=" + products.getProductID() + "> Delete</a>";
                table += "</td>";
                
                table += "</tr>";
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        
        table += "</table>";
        
            return table;
    
    }
    
    
}
