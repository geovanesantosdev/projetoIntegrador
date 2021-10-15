/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.Professor;

/**
 *
 * @author daniel (3), Esdras (2)
 */
public class ControleProfessor {

    private ArrayList<Professor> professores;

    public ControleProfessor() {
        professores = new ArrayList<>();
    }

    public boolean cadastrarProfessor(Professor p) {
        if (p != null && !professores.contains(p)) {
            professores.add(p);
            return true;
        }
        return false;
    }

    public boolean excluirProfessor(int id) {
        Professor p = new Professor(id);
        if (professores.contains(p)) {
            professores.remove(p);
            return true;
        }
        return false;
    }
    
    public Professor buscarProfessorPorNome(String nome) {
        for (int i = 0; i < professores.size(); i++) {
            // deve percorrer 'professores', no plural
            if (professores.get(i).getNome().equals(nome)) {                
                return professores.get(i);
            }
        }
        return null; // movi o retorno, continuava no for

        // o código de listar continuava aqui
    }

    public Professor buscarProfessorPorId(int id) {
        for (int i = 0; i < professores.size(); i++) {
            if (id == professores.get(i).getIdFuncionario()) {
                return professores.get(i);
            }
        }
        return null;
    }

    public ArrayList<Professor> listarProfessores() {
        if (this.professores.isEmpty()) {
            return null;
        }
        
        ArrayList<Professor> professores = new ArrayList<>();
        
        for (Professor p : this.professores) {
            professores.add(p);
        }
        return professores;
    }
}
