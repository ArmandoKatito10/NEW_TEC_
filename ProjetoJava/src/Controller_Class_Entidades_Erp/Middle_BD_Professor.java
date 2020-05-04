/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Class_Entidades_Erp;

import Classes.Professores;
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
public class Middle_BD_Professor {

    MyConectBD connection = new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet Resultado;

    public void InserirProfessor(Professores professor) {
        try {
            stmt = connection.conectar().prepareStatement("insert into  Professor values(?,?,?,?,?,?,?)");
            stmt.setInt(1, professor.getId_professor());
            stmt.setString(2, professor.getNome_professor());
            stmt.setString(3, professor.getGereno_professor());
            stmt.setString(4, professor.getEspecialidade_professor());
            stmt.setString(5, professor.getEndereco());
            stmt.setInt(6, professor.getTelefone());
            stmt.setString(7, professor.getInicio_funcao());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR-SE NA BASE DE DADOS SQL: "
                    + e.getMessage());
        } finally {
            connection.desconectar();
        }

    }

    public void ActualizarProfessor(Professores professor) {
        try {
            stmt = connection.conectar().prepareStatement("UPDATE  Professor  SET" + "nome_professor =?, gereno_professor=?,"
                    + "especialidade_professor=?,data_nascimento=?,inicio_funcao=?,endereco=?"+"WHERE id_professor =? ");
             stmt.setInt(1, professor.getId_professor());
            stmt.setString(2, professor.getNome_professor());
            stmt.setString(3, professor.getGereno_professor());
            stmt.setString(4, professor.getEspecialidade_professor());
            stmt.setString(5, professor.getEndereco());
            stmt.setInt(6, professor.getTelefone());
            stmt.setString(7, professor.getInicio_funcao());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Atualização Feita com Sucesso");
        } catch (Exception ex) {
            Logger.getLogger(Middle_BD_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Professores>ListarProfessor(){
        ArrayList Listar_Professores = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select * from Professor ");
            Resultado = stmt.executeQuery();
            while(Resultado.next()){
                Professores professor = new Professores();
                professor.setId_professor(Resultado.getInt(1));
                professor.setNome_professor(Resultado.getString(2));
                professor.setGereno_professor(Resultado.getString(3));
                professor.setEspecialidade_professor(Resultado.getString(4));
                professor.setEndereco(Resultado.getString(5));
                professor.setTelefone(Resultado.getInt(6));
                professor.setInicio_funcao(Resultado.getString(7));
                //professor.setEndereco(Resultado.getString(7));
                Listar_Professores.add(professor);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO AO BUSCAR NA BASE DE DADOS "+ e.getMessage());
        }
        finally{
            connection.desconectar();
        }
        return Listar_Professores;
    }

}
