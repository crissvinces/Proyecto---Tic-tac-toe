package ejerc.proyecto.tictactoe.ed;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    
    Stage stage1;

    @Override
    public void start(Stage stage1) {
        
        //Arranca el programa
        Label lbl_title= new Label("Tic Tac Toe");
        Button btn_iniciar_juego=new Button("Iniciar el Juego");
        lbl_title.setStyle("-fx-font-family: 'Verdana'; -fx-font-size: 35;-fx-text-fill: white;-fx-font-weight: bold;");
        BorderPane root= new BorderPane();
        BorderPane.setAlignment(lbl_title, Pos.CENTER);
        try {
            FileInputStream input = new FileInputStream("src/main/java/ejerc/proyecto/tictactoe/ed/imagen/tictactoe.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(200);  // Establecer el ancho deseado
            imageView.setFitHeight(200);
            
            VBox contenedor = new VBox(20);
            contenedor.getChildren().add(imageView);
            contenedor.getChildren().add(btn_iniciar_juego);
            contenedor.setAlignment(Pos.CENTER);
            
            root.setTop(lbl_title);
            root.setCenter(contenedor);
            root.setStyle("-fx-background-color: midnightblue;");
            
            btn_iniciar_juego.setOnMouseClicked(e->mostrarMenu());
            Scene scene = new Scene(new StackPane(root), 540, 340);
            stage1.setScene(scene);
            stage1.show();
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }

    private void mostrarMenu() {
        try {
            Menu ventanaMenu = new Menu();
            ventanaMenu.start(new Stage());
        } catch (Exception ex) {
        }
    }

}