/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc.proyecto.tictactoe.ed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    Button btn_1;
    private int X;
    private int O;
    private int turno;
    
     @Override
    public void start(Stage stage) throws Exception {
        
        Label lbl_title= new Label("INICIO EL JUEGO!!!");
        Font fuente_lbl = Font.font("Verdana", FontWeight.EXTRA_BOLD,25);
        lbl_title.setFont(fuente_lbl);
        lbl_title.setAlignment(Pos.TOP_CENTER);
        
        VBox contenedor=new VBox();
        contenedor.setSpacing(10);
        contenedor.setAlignment(Pos.CENTER);
        
        
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
        
        
        Button btn_2=new Button();
        btn_2.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_2.setGraphic(imageView2);
        
        Button btn_3=new Button();
        btn_3.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_3.setGraphic(imageView3);
        
        Button btn_4=new Button();
        btn_4.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_4.setGraphic(imageView4);
        
        Button btn_5=new Button();
        btn_5.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_5.setGraphic(imageView5);
        
        Button btn_6=new Button();
        btn_6.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_6.setGraphic(imageView6);
        
        Button btn_7=new Button();
        btn_7.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_7.setGraphic(imageView7);
        
        Button btn_8=new Button();
        btn_8.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        btn_8.setGraphic(imageView8);
        
        Button btn_9=new Button();
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
        
        contenedor.getChildren().add(lbl_title);
        contenedor.getChildren().add(tablero);
        
        btn_1.setOnMouseClicked(e -> {
            try {
                cambiarImagen();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        
        Scene scene = new Scene(contenedor, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    private List<Tablero> hijos;
    private int[][] matriz=new int[3][3];
    
    private boolean actualizarMatriz(){
        
         return false;
        
    }
    
    public Tablero (int X, int O, int turno){
        this.X=X;
        this.O=O;
        this.turno=turno;
    }
    
    private void cambiarImagen() throws FileNotFoundException{
        if(this.turno==1){
            if(X==1){
                FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/X.png");
                Image image = new Image(input);
                ImageView imageView= new ImageView(image);
                imageView.setFitWidth(70); 
                imageView.setFitHeight(70);
                btn_1.setGraphic(imageView);
            }
            if(O==1){
                FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/Circulo.png");
                Image image = new Image(input);
                ImageView imageView= new ImageView(image);
                imageView.setFitWidth(70); 
                imageView.setFitHeight(70);
                btn_1.setGraphic(imageView);
            }
        }
        if(this.turno==2){
            if(X==-1){
                FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/X.png");
                Image image = new Image(input);
                ImageView imageView= new ImageView(image);
                imageView.setFitWidth(70); 
                imageView.setFitHeight(70);
                btn_1.setGraphic(imageView);
            }
            if(O==-1){
                FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/Circulo.png");
                Image image = new Image(input);
                ImageView imageView= new ImageView(image);
                imageView.setFitWidth(70); 
                imageView.setFitHeight(70);
                btn_1.setGraphic(imageView);
            }
        }
        
    }
    
    private void cambiarImagenPersona(){
        
    }
   
    
}
