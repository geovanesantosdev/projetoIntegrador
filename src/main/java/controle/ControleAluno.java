/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Jonnatas (2), Michel (2), (1)
 */
public class ControleAluno {

    private ArrayList<Aluno> alunos;

    public ControleAluno() {
        alunos = new ArrayList<>();
    }
    
    public Aluno buscarAlunoPorMatricula(int matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (matricula == alunos.get(i).getMatricula()) {
                return alunos.get(i);
            }
        }
        
        Aluno aluno1 = buscarAlunoPorMatricula(10);
        
        return null;               
    }
    
    

    public ArrayList<Aluno> listarAlunosPorSerie(int idSerie) {
        if (this.alunos.size() == 0) {
            return null;
        }

        ArrayList<Aluno> alunosDaSerie = new ArrayList<>();
        for (Aluno a : this.alunos) {
            if (a.getIdSerie() == idSerie) {
                alunosDaSerie.add(a);
            }
        }
        return alunosDaSerie;
    }

    public boolean cadastrarAluno(Aluno aluno) {
        if (aluno != null && !alunos.contains(aluno)) {
            alunos.add(aluno);
            return true;
        }
        return false;
    }

    public boolean excluirAluno(int matricula) {
        Aluno aluno = new Aluno(matricula);
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
            return true;
        }
        return false;
    }
    
    public ArrayList<Aluno> buscarAlunoPorNome(String nome){
        ArrayList<Aluno> alunosComONome = new ArrayList<>();
        if(!alunos.isEmpty()){
            for(Aluno a : alunos){
                if(a.getNome().equals(nome)){
                    alunosComONome.add(a);
                }
            }
            return alunosComONome;
        }
        return null;
    }
}
