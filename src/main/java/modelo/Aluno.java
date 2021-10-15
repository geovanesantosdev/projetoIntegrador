/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Michel
 */
public class Aluno {

    private int matricula;
    private String nome;
    private String senha;
    private int idSerie;
    private ArrayList<Integer> idNotas;

    public boolean autenticar(int matricula, String senha) {
        if (this.matricula == matricula && this.senha.equals(senha)) {
            return true;
        }
        return false;
    }

    public Aluno(int mat) {
        this.matricula = mat;
    }

    public Aluno(int matricula, String nome, String senha,
             int idSerie, ArrayList<Integer> idNotas) {
        this.matricula = matricula;
        this.nome = nome;
        this.idSerie = idSerie;
        this.idNotas = idNotas;
    }

    public String toString() {
        return "matricula" + matricula
                + "\nnome" + nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;

    }

    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idserie) {
        this.idSerie = idSerie;
    }

    public ArrayList<Integer> getIdNotas() {
        return idNotas;
    }

    public void setIdNotas(ArrayList<Integer> idNotas) {
        this.idNotas = idNotas;
    }
}
