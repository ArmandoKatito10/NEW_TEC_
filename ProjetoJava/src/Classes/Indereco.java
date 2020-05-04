/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;

/**
 *
 * @author Armando Katito
 */
public class Indereco {

    private int id_indereco;
    private String pais;
    private String provincia;
    private String municipio;
    private String bairro;

    public String getMinicipio() {
        return municipio;
    }

    public void setMinicipio(String minicipio) {
        this.municipio = minicipio;
    }
    

    public int getId_indereco() {
        return id_indereco;
    }

    public void setId_indereco(int id_indereco) {
        this.id_indereco = id_indereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;

    }

    public void setProvincia(String provincia) {

        this.provincia = provincia;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setConnetion(Connection connection) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

}
