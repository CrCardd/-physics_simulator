package com.desktopapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.VBox;
import javafx.scene.shape.ArcType;
import java.util.Timer;
import java.util.TimerTask;

public class MainController implements Initializable {
      
    public static Scene CreateScene() throws Exception
    {
        
        URL sceneUrl = MainController.class
        .getResource("main-scene.fxml");
        
        FXMLLoader loader = new FXMLLoader(sceneUrl);
        
        Parent root = loader.load();
        Scene scene = new Scene(root);

        MainController controller = loader.getController();

        return scene;
    }

    @FXML
    private Canvas simulador;
    @FXML
    private VBox box;
    
    Timer timer = new Timer();
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        var g = simulador.getGraphicsContext2D();
        Massa massa = new Massa(10,100,100,30);
        Massa massa1 = new Massa(10,300,20,10);
        Mola mola = new  Mola(10, 100, massa, massa1);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                g.clearRect(0, 0, simulador.getWidth(), simulador.getHeight());
                
                massa.exercer(simulador);
                massa1.exercer(simulador);
                mola.exercer(simulador);
                
                box.requestLayout();
            }
        }, 50, 50);
    }




    
    

}
