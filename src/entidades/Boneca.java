/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;
import javax.swing.JLabel;


public class Boneca {
    
    private JLabel pele;
    private JLabel cabelo;
    private JLabel roupaS;
    private JLabel roupaI;
    private JLabel vestido;
    private JLabel conjunto;
    private JLabel sapato;
    private JLabel acessorio;
    private JLabel bolsa;

    public Boneca() {
        this.pele = new JLabel();
        this.cabelo = new JLabel();
        this.roupaS = new JLabel();
        this.roupaI = new JLabel();
        this.vestido = new JLabel();
        this.conjunto = new JLabel();
        this.sapato = new JLabel();
        this.acessorio = new JLabel();
        this.bolsa = new JLabel();
    }

    public JLabel getPele() {
        return pele;
    }

    public void setPele(JLabel pele) {
        this.pele = pele;
    }
    
    public JLabel getCabelo() {
        return cabelo;
    }

    public void setCabelo(JLabel cabelo) {
        this.cabelo = cabelo;
    }

    public JLabel getRoupaS() {
        return roupaS;
    }

    public void setRoupaS(JLabel roupaS) {
        this.roupaS = roupaS;
    }

    public JLabel getRoupaI() {
        return roupaI;
    }

    public void setRoupaI(JLabel roupaI) {
        this.roupaI = roupaI;
    }

    public JLabel getVestido() {
        return vestido;
    }

    public void setVestido(JLabel vestido) {
        this.vestido = vestido;
    }

    public JLabel getConjunto() {
        return conjunto;
    }

    public void setConjunto(JLabel conjunto) {
        this.conjunto = conjunto;
    }

    public JLabel getSapato() {
        return sapato;
    }

    public void setSapato(JLabel sapato) {
        this.sapato = sapato;
    }

    public JLabel getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(JLabel acessorio) {
        this.acessorio = acessorio;
    }

    public JLabel getBolsa() {
        return bolsa;
    }

    public void setBolsa(JLabel bolsa) {
        this.bolsa = bolsa;
    }

    public void setCabelo(List<JLabel> vestimenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public void setVestido(List<JLabel> vestimenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
    
}
