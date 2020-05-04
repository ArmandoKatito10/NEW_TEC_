/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysqlConectClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Armando Katito
 */
public class MyConectBD {

    private String drive = "com.mysql.jdbc.Driver";
    private String bd = "jdbc:mysql://localhost/ERPSCHOOL";
    private String utilizador = "root";
    private String senha = "";
    private Connection conect = null;

    public Connection conectar() throws SQLException {
        try {
            Class.forName(drive);
            conect = (Connection) DriverManager.getConnection(bd, utilizador, senha);
            System.out.println("CONEXÃO ESTABELECIDA");
        } catch (ClassNotFoundException ex) {
            System.out.println("DRIVER NÃO CONECTADA: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("ERRO AO CONECTAR-SE A DASE DE DADOS: " + ex.getMessage());
        }
        return conect;
    }

    public void desconectar() {

        try {

            conect.close();
        } catch (SQLException ex) {
            System.out.println("DESCONECTADA A  BD: " + ex.getMessage());
        }

    }

}
