/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Class_Entidades_Erp;

import Classes.Cargo;
import Classes.Funcionarios;
import static Controller_Class_Entidades_Erp.Middle_BD_Funcionario.Resultado;
import static Controller_Class_Entidades_Erp.Middle_BD_Funcionario.stmt;
import MysqlConectClasses.MyConectBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando Katito
 */
public class Middle_CargoBD {

    MyConectBD connection = new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet Resultado;

    public void AdicionarCargo(Cargo cargo) {
        try {
            stmt = connection.conectar().prepareStatement(" insert into Cargo"+" values(?,?,?,?)");
            stmt.setInt(1, cargo.getId_cargo());
            stmt.setString(2, cargo.getCargo());
            stmt.setString(3, cargo.getDesc_cargo());
            stmt.setDouble(4, cargo.getSalario());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "SUCESSO ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CANECTAR_SE SQL!  /ERRO:" + "" + ex.getMessage());
        }
    }

    public ArrayList<Cargo> ListarCargo() {
        ArrayList<Cargo> ListarCargos = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select * from Cargo");
            Resultado = stmt.executeQuery();
            while (Resultado.next()) {
                Cargo cargo = new Cargo();
                cargo.setId_cargo(Resultado.getInt(1));
                cargo.setDesc_cargo(Resultado.getString(3));
                cargo.setSalario(Resultado.getDouble(4));
                cargo.setCargo(Resultado.getString(2));
                ListarCargos.add(cargo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR NA BASE DE DADOS" + ex.getMessage());
        } finally {
            connection.desconectar();
        }
        return ListarCargos;
    }

}
