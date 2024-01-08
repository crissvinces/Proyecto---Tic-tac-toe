/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc.proyecto.tictactoe.ed;

import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author crist
 */
public class Tablero<E> extends Application {
    
     @Override
    public void start(Stage stage) throws Exception {
        GridPane tablero= new GridPane();
        tablero.setAlignment(Pos.CENTER);
        tablero.setHgap(10);
        tablero.setVgap(10);
        for (int i = 1; i < 5; i++) {
            Line line = new Line(0, i * 100, 300, i * 100);
            line.setStroke(Color.BLACK);
            tablero.getChildren().add(line);
        }
        // Agregar líneas verticales
        for (int i = 1; i < 3; i++) {
            Line line = new Line(i * 100, 0, i * 100, 200);
            line.setStroke(Color.BLACK);
            tablero.getChildren().add(line);
        }
        Scene scene = new Scene(tablero, 340, 240);
        stage.setScene(scene);
        stage.show();
    }

    private List<Tablero> hijos;
    private int[][] matriz=new int[3][3];
    
    private boolean actualizarMatriz(){
        
         return false;
        
    }
   
    
}
