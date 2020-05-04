/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller_Class_Entidades_Erp;

import Classes.Indereco;
import Classes.Usuarios;
import MysqlConectClasses.MyConectBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando Katito
 */
public class Middle_BD_Indereco {
      MyConectBD connection = new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet Resultado;
    
    public void Inserir(Indereco indereco) {
        try {

            stmt = connection.conectar().prepareStatement("insert into Indereco"
                    + " values (?,?,?,?,?)");
            stmt.setInt(1, indereco.getId_indereco());
            stmt.setString(2, indereco.getPais());
            stmt.setString(3, indereco.getProvincia());
            stmt.setString(4, indereco.getMinicipio());
            stmt.setString(5, indereco.getBairro());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "SUCESSO ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CANECTAR_SE SQL!  /ERRO:" + "" + ex.getMessage());
        } finally {
            connection.desconectar();
        }
    }
    
    
       public void atualizar(Indereco indereco) {

        try { 
  
            
            stmt = connection.conectar().prepareStatement("UPDATE Indereco SET"
                    + " pais=?,"
                    + " provincia =?,"
                    + "municipio=?,"
                    + " Bairro =?"
                    + " WHERE id_inderec=?");
            stmt.setInt(1, indereco.getId_indereco());
            stmt.setString(2, indereco.getPais());
            stmt.setString(3, indereco.getProvincia());
            stmt.setString(4, indereco.getMinicipio());
            stmt.setString(5, indereco.getBairro());
            stmt.execute();

            JOptionPane.showMessageDialog(null, "SUCESSO");
        } catch (SQLException ex) {
            Logger.getLogger(Middle_BD_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
         public ArrayList<Indereco> ListarInderecos() {
        ArrayList<Indereco> ListarInderecos = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select * from Indereco");
            Resultado = stmt.executeQuery();
            while (Resultado.next()) {
                Indereco indereco = new Indereco();
                indereco.setId_indereco(Resultado.getInt(1));
                indereco.setPais(Resultado.getString(2));
                indereco.setProvincia(Resultado.getString(3));
                indereco.setMinicipio(Resultado.getString(4));
                indereco.setBairro(Resultado.getString(5));
                
                ListarInderecos.add(indereco);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR NA BASE DE DADOS" + ex.getMessage());
        } finally {
            connection.desconectar();
        }
        return ListarInderecos;
    }
         
          public void apagar(Indereco indereco) {
        try {
            stmt = connection.conectar().prepareStatement("delete from Indereco where id_inderec=?");
            stmt.setInt(1, indereco.getId_indereco());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO DE DELETE:"
                    + " " + ex.getMessage());
        } finally {

            connection.desconectar();
        }

    }
    
}
