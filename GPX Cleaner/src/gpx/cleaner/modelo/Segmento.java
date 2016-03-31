/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpx.cleaner.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labccet
 */
public class Segmento {
    private List<Ponto> pontos;

    public Segmento() {
        this.pontos = new ArrayList<Ponto>();
    }

    Segmento(List<Ponto> pontos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public int contaPontos() {
        return pontos.size();
    }
    
    public Ponto pegaPontoIndice(int indice) {
        return pontos.get(indice);
    }
    
    public void adicionarPonto(double latitude, double longitude, double elevacao, String tempo, double erro) {
        pontos.add(new Ponto(latitude, longitude, elevacao, tempo, erro));
    }
    
    public void adicionarPonto(Ponto ponto) {
        pontos.add(ponto);
    }
    
    public void removePonto(int indice) {
        pontos.remove(indice);
    }  
    
    public Iterable<Ponto> getPontos() {
        return pontos;
    }
}
