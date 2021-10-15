/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jenifer
 */
public class Nota {

    private int idSerie;
    private int idDisciplina;
    private int idAluno;
    private int unidade;
    private double nota;

    public Nota(int idSerie, int idDisciplina, int idAluno, int unidade, double nota) {
        this.idSerie = idSerie;
        this.idDisciplina = idDisciplina;
        this.idAluno = idAluno;
        this.unidade = unidade;
        this.nota = nota;

    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;

    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
