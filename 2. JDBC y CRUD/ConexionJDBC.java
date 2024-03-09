/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package OneDrive.Escritorio;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ConexionJDBC {

    /**
     * @param args the command line arguments
     */
    Connection connection;
    Statement statement;
 
    
    public static void main(String args[]) {
        
        String usuario = "MarlonM";
        String password = "MarlonSENA2024";
        String url = "jdbc:mysql://localhost:3306/basedatosproyecto";
        Statement statement;
        ResultSet resultset;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Connection connection = DriverManager.getConnection(url, usuario, password);
            
            
                
        } catch (SQLException ex) {
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                resultset.close();
                statement.close();
                connection.close();
        
        
    }

