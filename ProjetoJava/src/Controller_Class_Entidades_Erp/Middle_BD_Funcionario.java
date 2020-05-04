/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Class_Entidades_Erp;
import Classes.Funcionarios;
import MysqlConectClasses.MyConectBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.Cadastrar_Funcionarios;

/**
 *
 * @author Armando Katito
 */
public class Middle_BD_Funcionario {
    Cadastrar_Funcionarios  funci = new Cadastrar_Funcionarios();
    MyConectBD connection = new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet Resultado;
 
    
    public void Inserir(Funcionarios funcionario) {
        try {
            stmt = connection.conectar().prepareStatement("insert into Funcionario"+
                    " values (?,?,?,?,?)");
           stmt.setInt(1, funcionario.getId_funcionario());
            stmt.setString(2, funcionario.getNome_funcionario());
            stmt.setString(4, funcionario.getInicio_funcao());
            stmt.setInt(3,  funcionario.getTelefone_funcionario());
            stmt.setString(5, funcionario.getGenero_funcionario());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "SUCESSO ");  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR DADOSNA TABELA!  /ERRO: " + "" + ex.getMessage());
        }
        finally{
            connection.desconectar();
        }
    }
    
 // MÉTODO PARA ACTUALIZAR
    public void atualizar(Funcionarios funcionario) {
        
               try {
            stmt = connection.conectar().prepareStatement("UPDATE Funcionario SET nome_funcionario=?,"
                    + " telefone_funcionario =?,data_inicio_funcao =?,telefone_funcionario=?, genero =? "
                    + " id_indereco_funcionario =?,cargo_funcionario =?"
                    + " WHERE id_funcionario=?");
            stmt.setInt(1, funcionario.getId_funcionario());
            stmt.setString(2, funcionario.getNome_funcionario());
            stmt.setInt(3, funcionario.getTelefone_funcionario());
            stmt.setString(4,   funcionario.getInicio_funcao());
            stmt.setString(5, funcionario.getGenero_funcionario());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "ACTUALIZAÇÃO FEITA");
        } catch (SQLException ex) {
            Logger.getLogger(Middle_BD_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // MÉTODO PARA LISTAR OS FUNCIONÁRIOS
    public ArrayList<Funcionarios> Listar() {
        ArrayList<Funcionarios> ListarFuncionarios = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select * from Funcionario");
            Resultado = stmt.executeQuery();
            while (Resultado.next()) {
                Funcionarios funcionario = new Funcionarios();
                funcionario.setId_funcionario(Resultado.getInt(1));
                funcionario.setNome_funcionario(Resultado.getString(2));
                funcionario.setGenero_funcionario(Resultado.getString(5));
                funcionario.setInicio_funcao(Resultado.getString(4));
                funcionario.setTelefone_funcionario(Resultado.getInt(3));
                ListarFuncionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR NA BASE DE DADOS" + ex.getMessage());
        } finally {
            connection.desconectar();
        }
        return ListarFuncionarios;
    }

}
