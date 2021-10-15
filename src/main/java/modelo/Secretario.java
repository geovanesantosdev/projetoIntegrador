/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gdsant
 */
public class Secretario extends Funcionario {

    public Secretario(int id, String nome) {
        this.idFuncionario = id;
        this.nome = nome;
        this.senha = this.nome.substring(0, 3)
                .toLowerCase() + id;
    }

    public Secretario(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    // Secretario s = new Secretario();
    // Funcionario f = new Funcionario(); 
    // f = s;
    // secretarios.get(i).equals(funcionario);
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != Secretario.class) {
            return false;
        }
        Secretario s = (Secretario) obj;
        if (this.cpf == s.getCpf()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "id: " + idFuncionario
                + "\nnome: " + nome;
    }

}
