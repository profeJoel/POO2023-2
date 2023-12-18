package com.emergente;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage ventana) throws IOException {

        ventana.setTitle("Probando ventanas emergentes");
        VBox panel = new VBox();
        Label texto = new Label("Bienvenido");
        Button boton = new Button("OK");
        //En java (variable) -> (operacion)
        // e: EventHandler -> {operaciones sobre la Interfaz}

        boton.setOnAction( e -> {
            //comentado para lanzar ventana emergente.
            //Emergente.mostrar("Ventana Emergente", "Solamente probar funcionalidad");
            //La operación Lambda implementa la funcion handle de EventHandler.
            boolean respuesta = Emergente.confirmar("Ventana de Confirmación", "Les gusta la Coca-Cola?");
            if (respuesta)
                texto.setText("Se confirma la opcion de Coca-Cola");
            else
                texto.setText("No les gusta la Coca-Cola");

        });
        panel.getChildren().addAll(texto, boton);
        

        scene = new Scene(panel, 640, 480);
        ventana.setScene(scene);
        ventana.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}