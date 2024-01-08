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

    @Override
    public void start(Stage stage) {
        Label lbl_title= new Label("Tic Tac Toe");
        Button btn_iniciar_juego=new Button("Iniciar el Juego");
        Font fuente_lbl = Font.font("Verdana", FontWeight.EXTRA_BOLD,25);
        lbl_title.setFont(fuente_lbl);
        BorderPane root= new BorderPane();
        BorderPane.setAlignment(lbl_title, Pos.CENTER);
        try {
            FileInputStream input = new FileInputStream("C:/Users/crist/OneDrive/Pictures/tic tac toe.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            VBox contenedor = new VBox(20);
            contenedor.getChildren().add(imageView);
            contenedor.getChildren().add(btn_iniciar_juego);
            contenedor.setAlignment(Pos.CENTER);
            root.setTop(lbl_title);
            root.setCenter(contenedor);
            Scene scene = new Scene(new StackPane(root), 540, 340);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }

}