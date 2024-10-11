package com.desktopapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;

public class Massa implements Initializable{

    private double peso;
    private double posicaoX;
    private double posicaoY;
    private double velocidadeX;
    private double velocidadeY;
    private double raio;
    private double diametro;



    public Massa(double peso, double posicaoX, double posicaoY, double velocidadeX, double velocidadeY, double raio) {
        this.peso = peso;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.velocidadeX = velocidadeX;
        this.velocidadeY = velocidadeY;
        this.raio = raio;
        this.diametro = raio*2;
    }



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }



    public double getPeso() {
        return peso;
    }
    public double getPosicaoX() {
        return posicaoX;
    }
    public void setPosicaoX(double posicaoX) {
        this.posicaoX = posicaoX;
    }
    public double getPosicaoY() {
        return posicaoY;
    }
    public void setPosicaoY(double posicaoY) {
        this.posicaoY = posicaoY;
    }
    public double getVelocidadeX() {
        return velocidadeX;
    }
    public void setVelocidadeX(double velocidadeX) {
        this.velocidadeX = velocidadeX;
    }
    public double getVelocidadeY() {
        return velocidadeY;
    }
    public void setVelocidadeY(double velocidadeY) {
        this.velocidadeY = velocidadeY;
    }
    public double getRaio() {
        return raio;
    }
    public double getDiametro() {
        return this.diametro;
    }
}
