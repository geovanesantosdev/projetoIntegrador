/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.Disciplina;

/**
 *
 * @author Gustavo
 */
public class ControleDisciplina {

    private ArrayList<Disciplina> disciplinas;

    public ControleDisciplina() {
        disciplinas = new ArrayList<>();
    }

    public boolean cadastrarDisciplina(Disciplina d) {
        if (d != null) {
            disciplinas.add(d);
            return true;
        }
        return false;
    }

    public boolean excluirDisciplina(Disciplina d) {
        if (disciplinas.contains(d)) {
            disciplinas.remove(d);
            return true;
        }
        return false;
    }

    public Disciplina buscarDisciplina(int idDisciplina) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getIdDisciplina() == idDisciplina) {
                return disciplinas.get(i);
            }
        }
        return null;
    }

    public ArrayList<Disciplina> listarDisciplinasPorSerie() {
        if (this.disciplinas.size() == 0) {
            return null;
        }
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        for (Disciplina d : this.disciplinas) {
            disciplinas.add(d);
        }
        return disciplinas;
    }

}
