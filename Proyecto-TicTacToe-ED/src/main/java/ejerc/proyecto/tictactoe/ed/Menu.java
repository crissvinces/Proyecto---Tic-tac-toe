/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc.proyecto.tictactoe.ed;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author crist
 */
public class Menu extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Label lbl_quienInicia= new Label("Quieres iniciar el juego?");
        Label lbl_queEres= new Label("Cual quieres ser?");
        CheckBox CB_tu= new CheckBox("Yo");
        CheckBox CB_compu= new CheckBox("La maquina");
        CheckBox CB_X= new CheckBox("X");
        CheckBox CB_O= new CheckBox("O");
        VBox contenedor= new VBox();
        HBox caja1= new HBox();
        HBox caja2= new HBox();
        caja1.getChildren().add(CB_tu);
        caja1.getChildren().add(CB_compu);
        caja2.getChildren().add(CB_X);
        caja2.getChildren().add(CB_O);
        contenedor.getChildren().add(lbl_quienInicia);
        contenedor.getChildren().add(caja1);
        contenedor.getChildren().add(lbl_queEres);
        contenedor.getChildren().add(caja2);
        Scene scene = new Scene(new StackPane(contenedor), 540, 340);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
