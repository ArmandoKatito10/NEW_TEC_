/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;

/**
 *
 * @author Armando Katito
 */
public class Funcionarios {

    private int id_funcionario;
    private String Nome_funcionario;
    private String inicio_funcao;
     private String Genero_funcionario;
    private int Telefone_funcionario;



    public int getId_funcionario() {
        return id_funcionario;
    }
    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    public String getNome_funcionario() {
        return Nome_funcionario;
    }

    public void setNome_funcionario(String Nome_funcionario) {
        this.Nome_funcionario = Nome_funcionario;
    }

  
    public String getGenero_funcionario() {
        return Genero_funcionario;
    }

    public void setGenero_funcionario(String Genero_funcionario) {
        this.Genero_funcionario = Genero_funcionario;
    }

    public String getInicio_funcao() {
        return inicio_funcao;
    }

    public void setInicio_funcao(String inicio_funcao) {
        this.inicio_funcao = inicio_funcao;
    }

   
    public int getTelefone_funcionario() {
        return Telefone_funcionario;
    }

    public void setTelefone_funcionario(int Telefone_funcionario) {
        this.Telefone_funcionario = Telefone_funcionario;
    }


}
