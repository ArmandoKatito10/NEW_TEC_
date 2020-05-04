/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Class_Entidades_Erp;

import Classes.Cursos;
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
public class Middle_BD_Cursos {

    MyConectBD connection = new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet Resultado;

    public void Inserir(Cursos Curso) {
        try {
            stmt = connection.conectar().prepareStatement(
                    "insert into curso values (?,?,?,?,?)"
            );
            stmt.setInt(1, Curso.getIdcurso());
            stmt.setString(2, Curso.getNomeCurso());
            stmt.setDouble(3, Curso.getPrecoCurso());
            stmt.setString(4, Curso.getCategoriaCurso());
            stmt.setString(5, Curso.getTempoDurabilidade());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Sucesso");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "ERRO AO CANECTAR_SE SQL!  /ERRO:" + "" + ex.getMessage());
        } finally {
            connection.desconectar();
        }

    }

    public void Actualizar(Cursos Curso) {
        try {
            stmt = connection.conectar().prepareStatement("UPDATE Curso SET "
                    + "idcurso=?, nomecurso=?, precocurso=?, categoriacurso=?, tempocurso=?, " + "WHERE idcurso = ?"
            );
            stmt.setInt(1, Curso.getIdcurso());
            stmt.setString(2, Curso.getNomeCurso());
            stmt.setDouble(3, Curso.getPrecoCurso());
            stmt.setString(4, Curso.getCategoriaCurso());
            stmt.setString(5, Curso.getTempoDurabilidade());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Sucesso");

        } catch (Exception ex) {

            Logger.getLogger(Middle_BD_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Cursos> Listarcursos() {

        ArrayList Listar_curso = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select* from Curso");
            Resultado = stmt.executeQuery();
            while (Resultado.next()) {
                Cursos curso = new Cursos();
                curso.setIdcurso(Resultado.getInt(1));
                curso.setNomeCurso(Resultado.getString(2));
                curso.setPrecoCurso(Resultado.getDouble(3));
                curso.setCategoriaCurso(Resultado.getString(4));
                curso.setTempoDurabilidade(Resultado.getString(5));
                Listar_curso.add(curso);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR NA BASE DE DADOS" + ex.getMessage());
        } finally {
            connection.desconectar();
        }
        return Listar_curso;
    }

}
