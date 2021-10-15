/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.Nota;

/**
 *
 * @author Jonnatas
 */
public class ControleNota {

    private ArrayList<Nota> notas;

    public ControleNota() {
        notas = new ArrayList<>();
    }

    public boolean cadastrarNota(Nota nota) {
        if (nota != null) {
            notas.add(nota);
            return true;
        }
        return false;
    }
}