/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Class_Entidades_Erp;

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
public class Middle_UsuarioBD {

    MyConectBD connection = new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet Resultado;

    public void Inserir(Usuarios usuarios) {
        try {

            stmt = connection.conectar().prepareStatement("insert into usuario (id_usuario,nome_usuario,senha_usuario)"
                    + " values (?,?,?)");
            stmt.setInt(1,usuarios.getId_usuario());
            stmt.setString(2, usuarios.getNome());
            stmt.setString(3, usuarios.getSenha());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "SUCESSO ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR DADOS!  /ERRO:" + "" + ex.getMessage());
        } finally {
            connection.desconectar();
        }
    }

    public void atualizar(Usuarios usuarios) {

        try {

            stmt = connection.conectar().prepareStatement("UPDATE usuario SET"
                    + " id_usuario=?,"
                    + " nome_usuario=?,"
                    + "senha_usuario=?,"
                    + " WHERE id_usuario=?");
            stmt.setInt(1, usuarios.getId_usuario());
            stmt.setString(2, usuarios.getNome());
            stmt.setString(3, usuarios.getSenha());
            stmt.execute();

            JOptionPane.showMessageDialog(null, "SUCESSO");
        } catch (SQLException ex) {
            Logger.getLogger(Middle_BD_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Usuarios> ListarUsuarios() {
        ArrayList<Usuarios> ListarUsuarios = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select * from Usuario");
            Resultado = stmt.executeQuery();
            while (Resultado.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setId_usuario(Resultado.getInt(1));
                usuario.setNome(Resultado.getString(2));
                usuario.setSenha(Resultado.getString(3));
                ListarUsuarios.add(usuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR NA BASE DE DADOS" + ex.getMessage());
        } finally {
            connection.desconectar();
        }
        return ListarUsuarios;
    }

}
