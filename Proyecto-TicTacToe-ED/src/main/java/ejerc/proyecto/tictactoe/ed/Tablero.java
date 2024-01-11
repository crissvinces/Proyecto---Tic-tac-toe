/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc.proyecto.tictactoe.ed;

import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author crist
 */
public class Tablero<E> extends Application {
    
     @Override
    public void start(Stage stage) throws Exception {
        
        Label lbl_title= new Label("INICIO EL JUEGO!!!");
        Font fuente_lbl = Font.font("Verdana", FontWeight.EXTRA_BOLD,25);
        lbl_title.setFont(fuente_lbl);
        lbl_title.setAlignment(Pos.CENTER);
        
        VBox contenedor=new VBox();
        contenedor.setSpacing(10);
        contenedor.setAlignment(Pos.CENTER);
        
        GridPane tablero= new GridPane();
        tablero.setAlignment(Pos.CENTER);
        tablero.setHgap(7);
        tablero.setVgap(7);
        tablero.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));
        
        Button btn_1=new Button("1");
        Button btn_2=new Button("2");
        Button btn_3=new Button("3");
        Button btn_4=new Button("4");
        Button btn_5=new Button("5");
        Button btn_6=new Button("6");
        Button btn_7=new Button("7");
        Button btn_8=new Button("8");
        Button btn_9=new Button("9");
        
        btn_1.setPrefSize(40, 40);
        btn_2.setPrefSize(40, 40);
        btn_3.setPrefSize(40, 40);
        btn_4.setPrefSize(40, 40);
        btn_5.setPrefSize(40, 40);
        btn_6.setPrefSize(40, 40);
        btn_7.setPrefSize(40, 40);
        btn_8.setPrefSize(40, 40);
        btn_9.setPrefSize(40, 40);
        
        tablero.add(btn_1, 0, 0);
        tablero.add(btn_2, 1, 0);
        tablero.add(btn_3, 2, 0);
        tablero.add(btn_4, 0, 1);
        tablero.add(btn_5, 1, 1);
        tablero.add(btn_6, 2, 1);
        tablero.add(btn_7, 0, 2);
        tablero.add(btn_8, 1, 2);
        tablero.add(btn_9, 2, 2);
        
        contenedor.getChildren().add(lbl_title);
        contenedor.getChildren().add(tablero);
        
        Scene scene = new Scene(contenedor, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    private List<Tablero> hijos;
    private int[][] matriz=new int[3][3];
    
    private boolean actualizarMatriz(){
        
         return false;
        
    }
   
    
}
