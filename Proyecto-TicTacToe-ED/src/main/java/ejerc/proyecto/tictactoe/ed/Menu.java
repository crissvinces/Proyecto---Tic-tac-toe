/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc.proyecto.tictactoe.ed;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author crist
 */
public class Menu extends Application{
    CheckBox CB_O;
    CheckBox CB_X;
    CheckBox CB_compu;
    CheckBox CB_tu;
    private int Jugador1;
    private int Jugador2;
    private String turno;
    private Tablero tablero;
    

    @Override
    public void start(Stage stage) throws Exception {
        
        Label lbl_Menu=new Label("Menu");
        lbl_Menu.setAlignment(Pos.CENTER);
        Font fuente_lbl = Font.font("Verdana", FontWeight.EXTRA_BOLD,20);
        lbl_Menu.setFont(fuente_lbl);
        lbl_Menu.setStyle("-fx-text-fill: white;");
        
        Label lbl_quienInicia= new Label("Quien quieres que inicie el juego?");
        lbl_quienInicia.setFont(fuente_lbl);
        lbl_quienInicia.setStyle("-fx-text-fill: white;");
        
        Label lbl_queEres= new Label("Cual quieres ser?");
        lbl_queEres.setFont(fuente_lbl);
        lbl_queEres.setStyle("-fx-text-fill: white;");
        
        CB_tu= new CheckBox("Yo");
        CB_tu.setStyle("-fx-text-fill: white;");
        
        CB_compu= new CheckBox("La maquina");
        CB_compu.setStyle("-fx-text-fill: white;");
        
        CB_X= new CheckBox("X");
        CB_X.setStyle("-fx-text-fill: white;");
        
        CB_O= new CheckBox("O");
        CB_O.setStyle("-fx-text-fill: white;");
        
        BorderPane contenedor= new BorderPane();
        contenedor.setStyle("-fx-background-color: midnightblue;");
        BorderPane.setAlignment(lbl_Menu, Pos.CENTER);
        BorderPane.setMargin(lbl_Menu, new Insets(20, 0, 10, 0));

        
        Button btn_iniciar= new Button("Iniciamos el juego");
        BorderPane.setAlignment(btn_iniciar, Pos.BOTTOM_CENTER);
        BorderPane.setMargin(btn_iniciar, new Insets(10, 0, 20, 0));
        
        VBox caja3=new VBox();
        caja3.setAlignment(Pos.CENTER);
        caja3.setSpacing(15);
        
        HBox caja1= new HBox();
        caja1.setAlignment(Pos.CENTER);
        caja1.setSpacing(15);
        
        HBox caja2= new HBox();
        caja2.setAlignment(Pos.CENTER);
        caja2.setSpacing(15);
        
        caja1.getChildren().add(CB_tu);
        caja1.getChildren().add(CB_compu);
        caja2.getChildren().add(CB_X);
        caja2.getChildren().add(CB_O);
        caja3.getChildren().add(lbl_quienInicia);
        caja3.getChildren().add(caja1);
        caja3.getChildren().add(lbl_queEres);
        caja3.getChildren().add(caja2);
        
        
        
        
        contenedor.setTop(lbl_Menu);
        contenedor.setCenter(caja3);
        contenedor.setBottom(btn_iniciar);
        
        btn_iniciar.setOnMouseClicked(e-> {
            try {
                acciones();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        
        Scene scene = new Scene(new StackPane(contenedor), 540, 340);
        stage.setScene(scene);
        stage.show();
        
    }
    
    private void acciones() throws Exception{
        recoleccion();
        if(recoleccion() == true){
            mostrarVentanaTablero();
        }
    }

    private void mostrarVentanaTablero() throws Exception {
        try {
            tablero = new Tablero(Jugador1,Jugador2);
            tablero.start(new Stage());
        } catch (Exception ex) {
        }
    }
    
    private boolean recoleccion(){
        boolean tu = CB_tu.isSelected();
        boolean X = CB_X.isSelected();
        boolean compu = CB_compu.isSelected();
        boolean O = CB_O.isSelected();
        
        if(!tu && !compu || tu && compu){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Error de Seleccion");
            alert.setContentText("Porfavor escoga solamente una de las opciones");
            alert.showAndWait();
            return false;
        }
        if(X==true && O==false){
                this.Jugador1=1;
                this.Jugador2=2;
        }
        if(O==true){
                this.Jugador1=2;
                this.Jugador2=1;
        }
        return true;
    }

    public int getJugador1() {
        return Jugador1;
    }

    public void setJugador1(int Jugador1) {
        this.Jugador1 = Jugador1;
    }

    public int getJugador2() {
        return Jugador2;
    }

    public void setJugador2(int Jugador2) {
        this.Jugador2 = Jugador2;
    }
    
}
