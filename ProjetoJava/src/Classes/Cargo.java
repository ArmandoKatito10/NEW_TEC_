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
public class Cargo {

    private String desc_cargo;
    private Double salario;
    private int id_cargo;
    private String Cargo;

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getDesc_cargo() {
        return desc_cargo;
    }

    public void setDesc_cargo(String desc_cargo) {
        this.desc_cargo = desc_cargo;
    }

}
