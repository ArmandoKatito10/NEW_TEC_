/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Class_Entidades_Erp;

import javax.swing.JOptionPane;
import Controller_Class_Entidades_Erp.Middle_BD_Cursos;
import Controller_Class_Entidades_Erp.Middle_BD_Estudante;
import Controller_Class_Entidades_Erp.Middle_BD_Funcionario;
import Controller_Class_Entidades_Erp.Middle_BD_Professor;
import Controller_Class_Entidades_Erp.Middle_BD_Salas;
import Controller_Class_Entidades_Erp.Middle_UsuarioBD;
import Classes.Cargo;
import Classes.Analitycs;
import Classes.Cursos;
import Classes.Estudantes;
import Classes.Funcionarios;
import Classes.Indereco;
import Classes.Professores;
import Classes.Usuarios;
import static Controller_Class_Entidades_Erp.Middle_BD_Cursos.Resultado;
import static Controller_Class_Entidades_Erp.Middle_BD_Cursos.stmt;
import static Controller_Class_Entidades_Erp.Middle_BD_Estudante.Resultado;
import static Controller_Class_Entidades_Erp.Middle_BD_Estudante.stmt;
import Controller_Class_Entidades_Erp.Middle_BD_Funcionario;
import static Controller_Class_Entidades_Erp.Middle_BD_Funcionario.Resultado;
import static Controller_Class_Entidades_Erp.Middle_BD_Funcionario.stmt;
import static Controller_Class_Entidades_Erp.Middle_BD_Professor.Resultado;
import static Controller_Class_Entidades_Erp.Middle_BD_Professor.stmt;
import static Controller_Class_Entidades_Erp.Middle_UsuarioBD.Resultado;
import static Controller_Class_Entidades_Erp.Middle_UsuarioBD.stmt;
import MysqlConectClasses.MyConectBD;
import static View.FrmVendas.resultado;
import static View.FrmVendas.stmt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armando Katito
 */
public class Middle_BD_Data_Analitycs {

    MyConectBD connection = new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet Resultado;
    
    
    
    
    
    
         public ArrayList<Funcionarios> Listarfuncion() {
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
    
    public ArrayList<Analitycs> ListarEntidades() {
        ArrayList<Analitycs> BuscarDados = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement(" select U.nome_usuario,P.nome_professor,E.nome_estudante,C.nome_curso,F.nome_funcionario  from usuario U \n"
                    + "inner join Funcionario F on F.id_funcionario = U.id_usuario join curso C on C.id_curso = U.id_usuario \n"
                    + "join estudante E on E.idestudante = U.id_usuario join Professor P on P.id_professor=E.idestudante;  ");
            Resultado = stmt.executeQuery();
            while (Resultado.next()) {
                Estudantes estudante = new Estudantes();
                estudante.setIdestudante(Resultado.getInt(1));
                estudante.setNomeEstudante(Resultado.getString(2));
                Professores professor = new Professores();
                professor.setId_professor(Resultado.getInt(3));
                professor.setNome_professor(Resultado.getString(4));
                Usuarios usuario = new Usuarios();
                usuario.setId_usuario(Resultado.getInt(5));
                usuario.setNome(Resultado.getString(6));
                Cursos curso = new Cursos();
                curso.setIdcurso(Resultado.getInt(7));
                curso.setNomeCurso(Resultado.getString(8));
                Funcionarios funcionario = new Funcionarios();
                funcionario.setId_funcionario(Resultado.getInt(9));
                funcionario.setNome_funcionario(Resultado.getString(10));                
                Analitycs analise = new Analitycs();
                analise.setUsuarios(Resultado.getString(1));
                analise.setProfessor(Resultado.getString(2));
                analise.setEstudantes(Resultado.getString(3));
                analise.setCursos(Resultado.getString(4));
                analise.setFuncionarios(Resultado.getString(5));
                BuscarDados.add(analise);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR-SE NA BASE DE DADOS" + e.getMessage());
        } finally {
            connection.desconectar();
        }
        return ListarEntidades();
    }
}
