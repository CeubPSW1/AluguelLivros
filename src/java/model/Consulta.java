/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;

/**
 *
 * @author Alexandre.Torres
 */
@Entity
public class Consulta extends Livro{

    @Override
    public boolean emprestar() {
        return false;
    }
    public String getTipo(){ return "Consulta";}
    
    
}
