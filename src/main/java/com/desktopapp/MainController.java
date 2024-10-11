package com.desktopapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.shape.ArcType;

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
    private Canvas circulo;
    
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        
        Massa massa = new Massa(10, 100, 100, 0, 50, 20);
        circulo.getGraphicsContext2D().fillArc(0, 0, massa.getDiametro(), massa.getDiametro(), 0, 360, ArcType.ROUND);

    }
    
    

}
