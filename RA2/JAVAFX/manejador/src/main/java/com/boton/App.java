package com.boton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    //Primera opcion: EventHandler
//public class App extends Application implements EventHandler<ActionEvent> {

    private static Scene scene;
    Button boton, botonNo;
    TextField campo;

    @Override
    public void start(Stage ventana) throws IOException {
        ventana.setTitle("Interacción con Boton");

        VBox panel = new VBox();

        Label texto = new Label("Bienvenido, Ingrese su nombre: ");
        campo = new TextField();
        boton = new Button("OK");
        botonNo = new Button("NO");

        /*
        boton.setOnAction(
            new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event){
                    //Implementar la accion que queramos...
                    System.out.println("apretar OK. Hola: " + campo.getText());
                }
            }
        );
        /* 
        botonNo.setOnAction(
            new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event){
                    //Implementar la accion que queramos...
                    System.out.println("Operacion Cancelada...");
                }
            }
        );
        */
        /*boton.setOnAction(this);
        botonNo.setOnAction(this);
        */
        
        //Operaciones Lambda
        boton.setOnAction( e -> {
            //System.out.println("apretar OK. Hola: " + campo.getText());
            if(campo.getText().length() > 0){
                texto.setText(campo.getText());
                campo.setVisible(false); //va a desaparecer
                boton.setVisible(false);
            }
        });
        botonNo.setOnAction( e -> {
            //System.out.println("Operacion Cancelada...");
            if(campo.getText().length() > 0){
                //campo.setText("");
                campo.clear();
                campo.setVisible(true);
                boton.setVisible(true);
                texto.setText("Bienvenido, Ingrese su nombre: ");
            }
        });

        panel.getChildren().addAll(texto, campo, boton, botonNo);

        scene = new Scene(panel, 640, 480);
        ventana.setScene(scene);
        ventana.show();
    }

    /* 
    @Override
    public void handle(ActionEvent event){
        if(event.getSource() == boton)
            System.out.println("apretar OK. Hola: " + campo.getText());
        
        if(event.getSource() == botonNo)
            System.out.println("Operacion Cancelada...");
    }*/

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