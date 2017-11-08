/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Alexandre.Torres
 */
@Entity
public class Editora {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    @OneToMany (mappedBy = "editora", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Livro> livros = new ArrayList<>();

    public void adiciona(Livro livro){
        livro.setEditora(this);
        livros.add(livro);
    }
    
    public List<Livro> getLivros() {
        return livros;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
