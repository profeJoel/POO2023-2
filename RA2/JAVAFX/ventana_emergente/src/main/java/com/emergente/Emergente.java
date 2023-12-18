package com.emergente;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Emergente {
    public static boolean respuesta = false;

    public static void mostrar(String titulo, String mensaje){
        Stage ventanaEmergente = new Stage();

        //COmportamiento de ventana emergente -> Modality -> Ventana Modal
        ventanaEmergente.initModality(Modality.APPLICATION_MODAL);
        ventanaEmergente.setTitle(titulo);
        ventanaEmergente.setMinWidth(400);

        Label texto = new Label("Hola " + mensaje);
        Button botonCerrar = new Button("Cerrar");
        botonCerrar.setOnAction( e -> ventanaEmergente.close() ); // se cierra la ventana

        VBox panel = new VBox();
        panel.getChildren().addAll(texto, botonCerrar);

        Scene escena = new Scene(panel);
        ventanaEmergente.setScene(escena);
        ventanaEmergente.showAndWait();
    }

    public static boolean confirmar(String titulo, String mensaje){
        Stage ventanaEmergente = new Stage();

        //COmportamiento de ventana emergente -> Modality -> Ventana Modal
        ventanaEmergente.initModality(Modality.APPLICATION_MODAL);
        ventanaEmergente.setTitle(titulo);
        ventanaEmergente.setMinWidth(400);

        Label texto = new Label("Hola " + mensaje);
        Button botonAceptar = new Button("Aceptar");
        botonAceptar.setOnAction( e -> {
            respuesta = true;
            ventanaEmergente.close();
        });
        Button botonCancelar = new Button("Cancelar");
        botonCancelar.setOnAction( e -> {
            respuesta = false;
            ventanaEmergente.close();
        });

        HBox botones = new HBox();
        botones.getChildren().addAll(botonAceptar, botonCancelar);

        VBox panel = new VBox();
        panel.getChildren().addAll(texto, botones);
        panel.setAlignment(Pos.CENTER);

        Scene escena = new Scene(panel);
        ventanaEmergente.setScene(escena);
        ventanaEmergente.showAndWait();
        
        return respuesta;
    }
}
