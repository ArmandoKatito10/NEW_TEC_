/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller_Class_Entidades_Erp;

import Classes.Funcionarios;
import static Controller_Class_Entidades_Erp.Middle_BD_Funcionario.Resultado;
import static Controller_Class_Entidades_Erp.Middle_BD_Funcionario.stmt;
import MysqlConectClasses.MyConectBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando Katito
 */
public class Middle_BD_Vendas {
    
    MyConectBD connection =  new MyConectBD();
    public static PreparedStatement stmt;
    public static ResultSet Resultado;
    
     public ArrayList<Funcionarios> listarVendas() {
        ArrayList<Funcionarios> ListarFuncionarios = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select v.id_venda, v.quantidade, f.nome_funcionario, p.nome_produto  from venda v inner join funcionario f on f.id_funcionario = v.id_funcionario join produto p on p.id_produto = v.id_produto");
            Resultado = stmt.executeQuery();
            while (Resultado.next()) {
                Funcionarios funcionario = new Funcionarios();
                funcionario.setId_funcionario(Resultado.getInt(1));
                funcionario.setNome_funcionario(Resultado.getString(2));
                funcionario.setGenero_funcionario(Resultado.getString(3));
                funcionario.setInicio_funcao(Resultado.getString(4));
                funcionario.setTelefone_funcionario(Resultado.getInt(5));
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
