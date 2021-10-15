/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gustavo
 */
public class Funcionario {

    protected int idFuncionario;
    protected String cpf;
    protected String nome;
    protected String senha;

    // adicionado
    @Override
    public String toString() {
        return "id: " + idFuncionario
                + "\nnome: " + nome;
    }    

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int IdFuncionario) {
        this.idFuncionario = IdFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticar(int id, String senha) {
        if (this.idFuncionario == id && this.senha == senha) {
            return true;
        }
        return false;

    }

}
