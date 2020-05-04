/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Class_Entidades_Erp;

import Classes.SalasAulas;
import MysqlConectClasses.MyConectBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando Katito
 */
public class Middle_BD_Salas {
       MyConectBD connection =  new MyConectBD();
     public static PreparedStatement stmt;
    public static ResultSet Resultado;
    /**
     private int id_sala;
    private int numero_sala;
    private String curso_sala;
    private int capacidade_sala;
     
     ***/
    
    public void InserirSalas(SalasAulas salas){
        try {
            stmt = connection.conectar().prepareStatement("insert into salas "+" Values (?,?,?,?)");
            stmt.setInt(1, salas.getId_sala());
            stmt.setInt(2, salas.getNumero_sala());
            stmt.setString(3, salas.getCurso_sala());
            stmt.setInt(4, salas.getCapacidade_sala());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO AO CONECTAR-SE NA BASE DE DADOS SQL//:"+ e.getMessage());
        }
        finally{
            connection.desconectar();
        }
    }
    
    public void ActualizarSalas(SalasAulas salas){
        try {
            stmt = connection.conectar().prepareStatement("UPDATE salas SET"+ "nume_sala =?,curso_sala=?,capacidade=?"
                    +"WHERE id_sala =?");
            stmt.setInt(1, salas.getId_sala());
            stmt.setInt(2, salas.getNumero_sala());
            stmt.setString(3, salas.getCurso_sala());
            stmt.setInt(4, salas.getCapacidade_sala());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Actualização feita com Sucesso");
        } catch (Exception ex) {
            Logger.getLogger(Middle_BD_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<SalasAulas>ListarSalas(){
        ArrayList Listar_salas = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select* from salas");
            Resultado = stmt.executeQuery();
            while(Resultado.next()){
                SalasAulas salas = new SalasAulas();
                salas.setId_sala(Resultado.getInt(1));
                salas.setNumero_sala(Resultado.getInt(2));
                salas.setCurso_sala(Resultado.getString(3));
                salas.setCapacidade_sala(Resultado.getInt(4));
                Listar_salas.add(salas);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO AO BUSCARNA BASE DE DADOS"+ e.getMessage());
        }
        finally{
            connection.desconectar();
        }
        return Listar_salas;
    }
    
}
