
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


public class ReadRecord {

    private Connection conn;
    private ResultSet results;

    private Products product = new Products();
    private int productID;
    
    public ReadRecord(int productID){

        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.productID = productID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }
    
    
    public void doRead(){
    
        try {
            String query = "Select * from PRODUCTS WHERE productID=?";
            
            PreparedStatement ps = conn.prepareStatement(query);  
            
            ps.setInt(1, productID);
            
            this.results = ps.executeQuery();
                
                this.results.next();
                
                product.setProductID(this.results.getInt("productID"));
                product.setProductName(this.results.getString("productName"));
                product.setPrice(this.results.getDouble("price"));
                product.setQuantity(this.results.getInt("quantity"));
                product.setCompany(this.results.getString("company"));                
                
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }            

    
    public Products getProduct(){
    
    return this.product;
    
    }


}
    

