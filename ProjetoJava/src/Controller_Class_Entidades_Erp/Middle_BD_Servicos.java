/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller_Class_Entidades_Erp;

import Classes.Funcionarios;
import Classes.Serivicos;
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
public class Middle_BD_Servicos {
    MyConectBD connection =  new MyConectBD();
     public static PreparedStatement stmt;
    public static ResultSet Resultado;
    
   public void Inserir(Serivicos produto) {
        try {
            stmt = connection.conectar().prepareStatement("insert into Produto"+
                    " values (?,?,?,?,?)");
            stmt.setInt(1, produto.getId_produto());
            stmt.setString(2, produto.getNome_produto());
            stmt.setDouble(3, produto.getPreco_produto());
            stmt.setInt(4, produto.getQuantidade_produto());
            stmt.setString(5, produto.getCategoria());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "SUCESSO ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CANECTAR_SE SQL!  /ERRO:" + "" + ex.getMessage());
        }
        finally{
            connection.desconectar();
        }
    }   
    
    public void atualizar(Serivicos produto) {   
               try {
            stmt = connection.conectar().prepareStatement("UPDATE Produto SET nome_produto=?,"
                    + " preco_produto =?,quantidade_produto =?,categoria=?"+" WHERE id_produto=?");
            stmt.setInt(1, produto.getId_produto());
            stmt.setString(2, produto.getNome_produto());
            stmt.setDouble(3, produto.getPreco_produto());
            stmt.setInt(4, produto.getQuantidade_produto());
            stmt.setString(5, produto.getCategoria());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "SUCESSO");
        } catch (SQLException ex) {
            Logger.getLogger(Middle_BD_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
       public ArrayList<Serivicos> ListarProdutos() {
        ArrayList<Serivicos> Listar_Produtos = new ArrayList<>();
        try {
            stmt = connection.conectar().prepareStatement("select * from Produto");
            Resultado = stmt.executeQuery();
            while (Resultado.next()) {
                Serivicos produto = new Serivicos();
                produto.setId_produto(Resultado.getInt(1));
                produto.setNome_produto(Resultado.getString(2));
                produto.setPreco_produto(Resultado.getDouble(3));
                produto.setQuantidade_produto(Resultado.getInt(4));
                produto.setCategoria(Resultado.getString(5));
                Listar_Produtos.add(produto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR NA BASE DE DADOS" + ex.getMessage());
        } finally {
            connection.desconectar();
        }
        return Listar_Produtos;
    }
    
    
    
    
}
