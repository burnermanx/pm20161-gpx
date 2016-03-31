/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpx.cleaner.modelo;

/**
 *
 * @author labccet
 */
public class Ponto {
    private double latitude;
    private double longitude;
    private double elevacao;
    private String tempo;
    private double erroRemocao;

    
    public Ponto(double latitude, double longitude, double elevacao, String tempo, double erroRemocao) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevacao = elevacao;
        this.tempo = tempo;
        this.erroRemocao = erroRemocao;
    }
    
    public Ponto() {
        this(0.0, 0.0, 0.0, "", 0.0);
    }
    
    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getElevacao() {
        return elevacao;
    }

    public void setElevacao(double elevacao) {
        this.elevacao = elevacao;
    }
    
    
    public double getErroRemocao() {
        return erroRemocao;
    }

    public void setErroRemocao(double erroRemocao) {
        this.erroRemocao = erroRemocao;
    }

}
