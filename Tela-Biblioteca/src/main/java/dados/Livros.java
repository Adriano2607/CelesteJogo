/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import static telas.CadastrarLivro.livros;

/**
 *
 * @author João
 */
public class Livros {
    private String nome;
    private String autor;
    private String genero;
    private String ano;

    public Livros(String nome, String autor, String genero, String ano) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
    }

    public Livros() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
     


    
}
