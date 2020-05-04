/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Armando Katito
 */
public class Cursos {

    private int idcurso;
    private String NomeCurso;
    private Double precoCurso;
    private String CategoriaCurso;
    private String tempoDurabilidade;

    public String getCategoriaCurso() {
        return CategoriaCurso;
    }

    public void setCategoriaCurso(String CategoriaCurso) {
        this.CategoriaCurso = CategoriaCurso;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String NomeCurso) {
        this.NomeCurso = NomeCurso;
    }

    public Double getPrecoCurso() {
        return precoCurso;
    }

    public void setPrecoCurso(Double precoCurso) {
        this.precoCurso = precoCurso;
    }
    public String getTempoDurabilidade() {
        return tempoDurabilidade;
    }

    public void setTempoDurabilidade(String tempoDurabilidade) {
        this.tempoDurabilidade = tempoDurabilidade;
    }

   

}
