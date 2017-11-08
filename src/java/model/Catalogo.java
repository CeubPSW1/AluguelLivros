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
public class Catalogo extends Livro {

    @Override
    public boolean emprestar() {
        if (this.isDisponivel()){
            this.setDisponivel(false);
            return true;
        }
        return false;
    }
    
    public String getTipo(){ return "Catalogo";}
}
