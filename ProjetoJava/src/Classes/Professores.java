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
public class Professores {

    private int id_professor;
    private String Nome_professor;
    private String gereno_professor;
    private String especialidade_professor;
    private String inicio_funcao;
    private String endereco;
    private int telefone;

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getNome_professor() {
        return Nome_professor;
    }

    public void setNome_professor(String Nome_professor) {
        this.Nome_professor = Nome_professor;
    }

    public String getGereno_professor() {
        return gereno_professor;
    }

    public void setGereno_professor(String gereno_professor) {
        this.gereno_professor = gereno_professor;
    }

    public String getEspecialidade_professor() {
        return especialidade_professor;
    }

    public void setEspecialidade_professor(String especialidade_professor) {
        this.especialidade_professor = especialidade_professor;
    }

    public String getInicio_funcao() {
        return inicio_funcao;
    }

    public void setInicio_funcao(String inicio_funcao) {
        this.inicio_funcao = inicio_funcao;
    }

 
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

   
 


}
