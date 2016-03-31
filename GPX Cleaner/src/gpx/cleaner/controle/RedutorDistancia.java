/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpx.cleaner.controle;

import gpx.cleaner.modelo.Ponto;
import gpx.cleaner.modelo.Segmento;
import gpx.cleaner.modelo.Trilha;

/**
 *
 * @author labccet
 */
public class RedutorDistancia {
    public Trilha executa(Trilha trilha, double distanciaMaxima) {
        Trilha trilhaUnica = juntaSegmentosTrilha(trilha);
        return null;
    }

    /**
     * Cria uma nova trilha a partir da junção dos segmentos de uma trilha
     * @param trilha
     */
    public Trilha juntaSegmentosTrilha(Trilha trilha) {
        
        Segmento segmentoJunto = new Segmento();
        
        for (Segmento segmento : trilha.getSegmentos()) {
            for (Ponto ponto : segmento.getPontos()) {
                segmentoJunto.adicionarPonto(ponto);
            }
        }
        
        Trilha saida = new Trilha();
        saida.setNome(trilha.getNome());
        saida.adicionarSegmento(segmentoJunto);
        return saida;
    }
    
    /**
     * Calcula o erro de remoção de cada ponto, exceto os extremos.  
     */
    private void calculaErroRemocaoPontos(Trilha trilhaUnica) {
        Segmento segmentoUnico = trilhaUnica.pegaSegmentoIndice(0);
        int quantidadePontos = segmentoUnico.contaPontos();
        for (int i = 1; i < quantidadePontos - 1; i++) {
            Ponto atual = segmentoUnico.pegaPontoIndice(i);
            Ponto anterior = segmentoUnico.pegaPontoIndice(i-1);
            Ponto posterior = segmentoUnico.pegaPontoIndice(i+1);
            
            double erro = calculaErroRemocao(anterior, atual, posterior);
            atual.setErroRemocao(erro); 
        }
    }
    
    private double calculaErroRemocao(Ponto anterior, Ponto atual, Ponto posterior) {
        return 0.0;
    }
    
}
