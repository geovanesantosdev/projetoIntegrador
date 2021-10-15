/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.Serie;

/**
 *
 * @author gdsant
 */
public class ControleSerie {

    private ArrayList<Serie> series;

    public ControleSerie() {
        series = new ArrayList<>();
    }
    
    public boolean cadastrarSerie(Serie s){
        if(s != null && !series.contains(s)){
            this.series.add(s);
            return true;
        }
        return false;
    }
    
    public boolean excluirSerie(int id){
        Serie s = new Serie(id);
        if(this.series.contains(s)){
            this.series.remove(s);
            return true;
        }
        return false;
    }
    
    public ArrayList<Serie> listarSeries(){
        if(!this.series.isEmpty()){
            return this.series;
        }
        return null;
    }
}
