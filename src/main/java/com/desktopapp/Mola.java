package com.desktopapp;

import javafx.scene.canvas.Canvas;

public class Mola {
    
    private double resistencia;
    private double comprimento;
    private Massa massa1;
    private Massa massa2;


    public Mola(double resistencia, double comprimento, Massa massa1, Massa massa2) {
        this.resistencia = resistencia;
        this.comprimento = comprimento;
        this.massa1 = massa1;
        this.massa2 = massa2;
    }


    public void exercer(Canvas simulador){
        double massa1X = massa1.getPosicaoX() + massa1.getRaio();
        double massa1Y = massa1.getPosicaoY() + massa1.getRaio();
        
        double massa2X = massa2.getPosicaoX() + massa2.getRaio();
        double massa2Y = massa2.getPosicaoY() + massa2.getRaio();
        


        double distancia = Math.sqrt(Math.pow(Math.abs(massa1X - massa2X),2) + Math.pow(Math.abs(massa1Y - massa2Y), 2));

        double deformacacao = this.comprimento - distancia;
        


        simulador.getGraphicsContext2D().strokeLine(
            massa1.getPosicaoX() + massa1.getRaio(), massa1.getPosicaoY() + massa1.getRaio(),
            massa2.getPosicaoX() + massa2.getRaio(), massa2.getPosicaoY() + massa2.getRaio()
        );
    }

    
}
