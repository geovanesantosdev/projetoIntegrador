/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Esdras
 */
public class Professor extends Funcionario {
// adicionei o extends

    // public String nome;
    // public int id;
    private int idDisciplina;      
    
    public Professor(int id, String nome, int idDisciplina) {
        this.nome = nome;
        this.idFuncionario = id;
        this.idDisciplina = idDisciplina;
    }
    
    public Professor(int id){
        this.idFuncionario = id;
    }

    @Override
    public String toString() {
        // pequena alteração
        return super.toString()
                + "\nidDisciplina; " + idDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return idFuncionario;
    }

    public void setId(int id) {
        this.idFuncionario = id;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

}
