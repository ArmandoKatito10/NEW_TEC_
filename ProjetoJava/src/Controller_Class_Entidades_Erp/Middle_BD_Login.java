/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller_Class_Entidades_Erp;

import Classes.Usuarios;
import static Controller_Class_Entidades_Erp.Middle_BD_Funcionario.stmt;
import MysqlConectClasses.MyConectBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando Katito
 */
public class Middle_BD_Login {
    MyConectBD connection = new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet resultado;
    boolean check;

    public boolean Logar(String nome, String senha) throws SQLException {
        
        try {
            stmt = connection.conectar().prepareStatement("select * from usuario where nome_usuario = ? and senha_usuario=?");
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            resultado = stmt.executeQuery();
            
            if(resultado.next()){
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;

       
    }

    
}
