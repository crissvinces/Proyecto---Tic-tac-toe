/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc.proyecto.tictactoe.ed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
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
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    private int X;
    private int O;
    int turno=0;
    
     @Override
    public void start(Stage stage) throws Exception {
        
        Label lbl_title= new Label("INICIO EL JUEGO!!!");
        Font fuente_lbl = Font.font("Verdana", FontWeight.EXTRA_BOLD,35);
        lbl_title.setFont(fuente_lbl);
        lbl_title.setStyle("-fx-text-fill: white;");

        
        BorderPane contenedor=new BorderPane();
        BorderPane.setAlignment(lbl_title, Pos.TOP_CENTER);
        contenedor.setStyle("-fx-background-color: midnightblue;");
        BorderPane.setMargin(lbl_title, new Insets(20, 0, 10, 0));
        
        
        GridPane tablero= new GridPane();
        tablero.setAlignment(Pos.CENTER);
        tablero.setHgap(0);
        tablero.setVgap(0);
        tablero.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));
        tablero.setStyle("-fx-background-color: black;");
        tablero.setMinSize(250, 235);
        tablero.setMaxSize(250, 235);
        tablero.setPrefSize(250, 235);
        
        FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/Blancoo.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(70); 
        imageView.setFitHeight(70);
        
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitWidth(70); 
        imageView2.setFitHeight(70);
        
        ImageView imageView3= new ImageView(image);
        imageView3.setFitWidth(70); 
        imageView3.setFitHeight(70);
        
        ImageView imageView4= new ImageView(image);
        imageView4.setFitWidth(70); 
        imageView4.setFitHeight(70);
        
        ImageView imageView5= new ImageView(image);
        imageView5.setFitWidth(70); 
        imageView5.setFitHeight(70);
        
        ImageView imageView6= new ImageView(image);
        imageView6.setFitWidth(70); 
        imageView6.setFitHeight(70);
        
        ImageView imageView7= new ImageView(image);
        imageView7.setFitWidth(70); 
        imageView7.setFitHeight(70);
        
        ImageView imageView8= new ImageView(image);
        imageView8.setFitWidth(70); 
        imageView8.setFitHeight(70);
        
        ImageView imageView9= new ImageView(image);
        imageView9.setFitWidth(70); 
        imageView9.setFitHeight(70);
        
        
        
        
        btn_1=new Button();
        btn_1.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_1.setGraphic(imageView);
        
        
        btn_2=new Button();
        btn_2.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_2.setGraphic(imageView2);
        
        btn_3=new Button();
        btn_3.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_3.setGraphic(imageView3);
        
        btn_4=new Button();
        btn_4.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_4.setGraphic(imageView4);
        
        btn_5=new Button();
        btn_5.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_5.setGraphic(imageView5);
        
        btn_6=new Button();
        btn_6.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_6.setGraphic(imageView6);
        
        btn_7=new Button();
        btn_7.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_7.setGraphic(imageView7);
        
        btn_8=new Button();
        btn_8.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_8.setGraphic(imageView8);
        
        btn_9=new Button();
        btn_9.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_9.setGraphic(imageView9);
        
        btn_1.setPrefSize(70, 70);
        btn_2.setPrefSize(70, 70);
        btn_3.setPrefSize(70, 70);
        btn_4.setPrefSize(70, 70);
        btn_5.setPrefSize(70, 70);
        btn_6.setPrefSize(70, 70);
        btn_7.setPrefSize(70, 70);
        btn_8.setPrefSize(70, 70);
        btn_9.setPrefSize(70, 70);
        
        tablero.add(btn_1, 0, 0);
        tablero.add(btn_2, 1, 0);
        tablero.add(btn_3, 2, 0);
        tablero.add(btn_4, 0, 1);
        tablero.add(btn_5, 1, 1);
        tablero.add(btn_6, 2, 1);
        tablero.add(btn_7, 0, 2);
        tablero.add(btn_8, 1, 2);
        tablero.add(btn_9, 2, 2);
        
        
        contenedor.setTop(lbl_title);
        contenedor.setCenter(tablero);
        
        btn_1.setOnMouseClicked(e -> {
            try {
                actualizarMatriz(0,0);
                cambiarImagen(btn_1);
                 actualizarTurno();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        
        btn_2.setOnMouseClicked(e-> {
            try {
                actualizarMatriz(0,1);
                cambiarImagen(btn_2);
                 actualizarTurno();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        btn_3.setOnMouseClicked(e-> {
            try {
                actualizarMatriz(0,2);
                cambiarImagen(btn_3);
                 actualizarTurno();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        btn_4.setOnMouseClicked(e-> {
            try {
                actualizarMatriz(1,0);
                cambiarImagen(btn_4);
                 actualizarTurno();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        btn_5.setOnMouseClicked(e-> {
            try {
                actualizarMatriz(1,1);
                cambiarImagen(btn_5);
                actualizarTurno();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        btn_6.setOnMouseClicked(e-> {
            try {
                actualizarMatriz(1,2);
                cambiarImagen(btn_6);
                 actualizarTurno();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        btn_7.setOnMouseClicked(e-> {
            try {
                actualizarMatriz(2,0);
                cambiarImagen(btn_7);
                 actualizarTurno();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        btn_8.setOnMouseClicked(e-> {
            try {
                actualizarMatriz(2,1);
                cambiarImagen(btn_8);
                 actualizarTurno();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });btn_9.setOnMouseClicked(e-> {
            try {
                actualizarMatriz(2,2);
                cambiarImagen(btn_9);
                 actualizarTurno();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        
        Scene scene = new Scene(contenedor, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getO() {
        return O;
    }

    public void setO(int O) {
        this.O = O;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public List<Tablero> getHijos() {
        return hijos;
    }

    public void setHijos(List<Tablero> hijos) {
        this.hijos = hijos;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    private List<Tablero> hijos;
    private String[][] matriz=new String[3][3];
    
    private void actualizarMatriz(int fila , int columna){
        if(this.turno==1){
            if(X==1){
                matriz[fila][columna]="x";
            }else if(O==1){
               matriz[fila][columna]="o";
            }
        }else if(this.turno==2){
            if(X==-1){
                matriz[fila][columna]="x";
                
            }else if(O==-1){
               matriz[fila][columna]="o";
                
            }
        }
        verMatriz();
    }
    
    public Tablero (int X, int O, int turno){
        this.X=X;
        this.O=O;
        this.turno=turno;
    }
    
    public void actualizarTurno(){
        this.turno=(this.turno % 2) + 1;
    }
    
    private void cambiarImagen(Button boton) throws FileNotFoundException{
        if(this.turno==1){
            if(X==1){
                FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/X.png");
                Image image = new Image(input);
                ImageView imageView= new ImageView(image);
                imageView.setFitWidth(70); 
                imageView.setFitHeight(70);
                boton.setGraphic(imageView);
                
            }
            else if(O==1){
                FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/Circulo.png");
                Image image = new Image(input);
                ImageView imageView= new ImageView(image);
                imageView.setFitWidth(70); 
                imageView.setFitHeight(70);
                boton.setGraphic(imageView);
            }
        }
        else if(this.turno==2){
            if(X==-1){
                FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/X.png");
                Image image = new Image(input);
                ImageView imageView= new ImageView(image);
                imageView.setFitWidth(70); 
                imageView.setFitHeight(70);
                boton.setGraphic(imageView);
            }
            else if(O==-1){
                FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/Circulo.png");
                Image image = new Image(input);
                ImageView imageView= new ImageView(image);
                imageView.setFitWidth(70); 
                imageView.setFitHeight(70);
                boton.setGraphic(imageView);
            }
        }
       if(comprobarGanador()){
           Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Error de Seleccion");
            alert.setContentText("Porfavor escoga solamente una de las opciones");
            alert.showAndWait();
       }
    }
    
    public boolean ganadorFilas(){
        
        for(int f=0; f<3 ;f++){
            String valor1=this.matriz[f][0];
            String valor2=this.matriz[f][1];
            String valor3=this.matriz[f][2];
            if(valor1 !=null && valor2!=null && valor3 != null){
            if(valor1.equals("x") && valor2.equals("x") && valor3.equals("x")){
                return true;
            }
            if(valor1.equals("o") && valor2.equals("o") && valor3.equals("o")){
                return true;
            }
            }
        }
        return false;
    }
    
    public boolean ganadorColumnas(){
        for(int f=0; f<3 ;f++){
            String valor1=this.matriz[0][f];
            String valor2=this.matriz[1][f];
            String valor3=this.matriz[2][f];
            if(valor1 !=null && valor2!=null && valor3 != null){
            if(valor1.equals("x") && valor2.equals("x") && valor3.equals("x")){
                return true;
            }
            if(valor1.equals("o") && valor2.equals("o") && valor3.equals("o")){
                return true;
            }
            }
        }
        return false;
    }
    
    public boolean lateral1(){
        String valor1=this.matriz[0][0];
        String valor2=this.matriz[1][1];
        String valor3=this.matriz[2][2];
        if(valor1 !=null && valor2!=null && valor3 != null){
        if(valor1.equals("x") && valor2.equals("x") && valor3.equals("x")){
                return true;
        }
        if(valor1.equals("o") && valor2.equals("o") && valor3.equals("o")){
                return true;
        }
        }
        return false;
    }
    
    public boolean lateral2(){
        String valor1=this.matriz[0][2];
        String valor2=this.matriz[1][1];
        String valor3=this.matriz[2][0];
        if(valor1 !=null && valor2!=null && valor3 != null){
        if(valor1.equals("x") && valor2.equals("x") && valor3.equals("x")){
                return true;
        }
        if(valor1.equals("o") && valor2.equals("o") && valor3.equals("o")){
                return true;
        }
        }
        return false;
    }
    
    
    public boolean comprobarGanador(){
        if(ganadorFilas()||ganadorColumnas()||lateral1()||lateral2()){
            return true;
        }
        return false;
        
    }

    private void verMatriz() {
        System.out.println(matriz[0][0]+matriz[0][1]+matriz[0][2]);
        System.out.println(matriz[1][0]+matriz[1][1]+matriz[1][2]);
        System.out.println(matriz[2][0]+matriz[2][1]+matriz[2][2]);
    }
    
    public int calcularUtilidad(){
        
    }
}
