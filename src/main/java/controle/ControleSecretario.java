/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.Secretario;

/**
 *
 * @author Jenifer (1),
 */
public class ControleSecretario {

    private ArrayList<Secretario> secretarios;
            
    public ControleSecretario() {
        secretarios = new ArrayList<>();        
    }

    public Secretario buscarSecretarioPorId(int idSecretario) {

        for (int i = 0; i < secretarios.size(); i++) {
            if (secretarios.get(i).getIdFuncionario() == idSecretario) {
                return secretarios.get(i);
            }
        }
        return null;
    }

    public boolean excluirSecretario(String cpf) {
        Secretario s = new Secretario(cpf);
        
        if (secretarios.contains(s)) {
            secretarios.remove(s);
            return true;
        }
        
        return false;
    }

}
