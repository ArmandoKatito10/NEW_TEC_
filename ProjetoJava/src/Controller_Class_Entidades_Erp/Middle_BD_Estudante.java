/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Class_Entidades_Erp;

import Classes.Cursos;
import Classes.Estudantes;
import Classes.Indereco;
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
public class Middle_BD_Estudante {

    MyConectBD connection = new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet Resultado;

    public void Inserir(Estudantes estudante) {
        try {

            stmt = connection.conectar().prepareStatement("insert into estudante  "+" values(?,?,?,?,?)");
            stmt.setInt(1, estudante.getIdestudante());
            stmt.setString(2, estudante.getNomeEstudante());
            stmt.setString(3, estudante.getCidade());
            stmt.setString(4, estudante.getGenero());
            stmt.setInt(5, estudante.getTelefone());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "SUCESSO");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR-SE NA BASE DE  DADOS SQL/:"
                    + "" + ex.getMessage());

        } finally {
            connection.desconectar();
        }
    }

    public void Actualizar(Estudantes estudante) {
        try {
            stmt = connection.conectar().prepareStatement("UPDATE estudante SET" + "nome_estudante = ?"
                    + ",genero=?, telefone =?,cidade=?,num_sala =?"
                    + "WHERE id_estudante =?");
            stmt.setInt(1, estudante.getIdestudante());
            stmt.setString(2, estudante.getNomeEstudante());
            stmt.setString(3, estudante.getCidade());
            stmt.setString(4, estudante.getGenero());
            stmt.setInt(5, estudante.getTelefone());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "ACTUALIZAÇÃO FEITA COM SUCESSO");

        } catch (Exception ex) {
            Logger.getLogger(Middle_BD_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Estudantes> ListarEstudante() {
        ArrayList<Estudantes> Listar_estudantes = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select * from estudante");
            Resultado = stmt.executeQuery();
            while (Resultado.next()) {
                Estudantes estudante = new Estudantes();
                estudante.setIdestudante(Resultado.getInt(1));
                estudante.setNomeEstudante(Resultado.getString(2));
                estudante.setCidade(Resultado.getString(3));
                estudante.setGenero(Resultado.getString(4));
                estudante.setTelefone(Resultado.getInt(5));
                Listar_estudantes.add(estudante);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR NA BASE DE DADOS" + ex.getMessage());
        } finally {
            connection.desconectar();
        }
        return Listar_estudantes;
    }

}
