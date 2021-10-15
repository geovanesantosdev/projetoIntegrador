/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ana
 */
public class Disciplina {

    private int idSerie;
    private String nome;
    private int idDisciplina;

    public Disciplina(int id, int idSerie, String nome) {
        this.idSerie = idSerie;
        this.nome = nome;
        this.idDisciplina = id;
    }

    @Override
    public String toString() {
        return "nome: " + nome;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int id) {
        this.idDisciplina = id;
    }

}
