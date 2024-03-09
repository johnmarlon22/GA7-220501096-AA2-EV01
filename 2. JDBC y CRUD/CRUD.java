/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package OneDrive.Escritorio;
import java.sql.*;


/**
 *
 * @author Usuario
 */
public class CRUD {

    /**
     * @param args the command line arguments
     */
 public static void main(String args[]) {
     
}
 
 public void crearRegistro(String nombre, int edad) throws SQLException {
    Connection connection = null;
    PreparedStatement statement = null;
    
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatosproyecto", "MarlonM", "MarlonSENA2024");
        String query = "INSERT INTO Clientes (nombre, edad) VALUES (?, ?)";
        statement = connection.prepareStatement(query);
        statement.setString(1, nombre);
        statement.setInt(2, edad);
        statement.executeUpdate();
    } finally {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}

public void leerRegistros() throws SQLException {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    
    try {
        connection = DriverManager.getConnection("\"jdbc:mysql://localhost:3306/basedatosproyecto\", \"MarlonM\", \"MarlonSENA2024\"");
        statement = connection.createStatement();
        String query = "SELECT * FROM Clientes";
        resultSet = statement.executeQuery(query);
        
        while (resultSet.next()) {
            // Procesar cada fila del resultado
        }
    } finally {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}

public void actualizarRegistro(int id, String nombre, int edad) throws SQLException {
    Connection connection = null;
    PreparedStatement statement = null;
    
    try {
        connection = DriverManager.getConnection("\"jdbc:mysql://localhost:3306/basedatosproyecto\", \"MarlonM\", \"MarlonSENA2024\"");
        String query = "UPDATE Clientes SET nombre = ?, edad = ? WHERE id = ?";
        statement = connection.prepareStatement(query);
        statement.setString(1, nombre);
        statement.setInt(2, edad);
        statement.setInt(3, id);
        statement.executeUpdate();
    } finally {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}

public void eliminarRegistro(int id) throws SQLException {
    Connection connection = null;
    PreparedStatement statement = null;
    
    try {
        connection = DriverManager.getConnection("\"jdbc:mysql://localhost:3306/basedatosproyecto\", \"MarlonM\", \"MarlonSENA2024\");
        String query = "DELETE FROM Clientes WHERE id = ?";
        statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        statement.executeUpdate();
    } finally {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}    