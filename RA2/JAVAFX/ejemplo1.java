package JAVAFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class ejemplo1 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("ejemplo 1 de JavaFX");

        VBox contenedor = new VBox();

        Label texto1 = new Label("Hola, este el ejemplo");
        Button boton1 = new Button("OK");

        contenedor.getChildren().add(texto1);
        contenedor.getChildren().add(boton1);
        //contenedor.getChildren().addAll(texto1,boton1);

        Scene escena = new Scene(contenedor, 500, 500);
        ventana.setScene(escena);
        ventana.show();
    }
}