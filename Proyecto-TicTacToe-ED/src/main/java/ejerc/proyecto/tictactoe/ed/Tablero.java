/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc.proyecto.tictactoe.ed;

import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author crist
 */
public class Tablero extends Application {
    
     @Override
    public void start(Stage stage) throws Exception {
        GridPane tablero= new GridPane();
        Scene scene = new Scene(new StackPane(tablero), 340, 240);
        stage.setScene(scene);
        stage.show();
    }

    private List<Tablero> hijos;
   
    
}
