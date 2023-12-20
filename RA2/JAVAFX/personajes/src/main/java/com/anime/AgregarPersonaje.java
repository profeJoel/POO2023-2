package com.anime;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AgregarPersonaje {
    public static String vista(){
        String personaje = "";
        Stage ventana = new Stage();
        ventana.setTitle("Agregar Personaje de Anime");
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.setMinWidth(600);

        VBox panelGeneral = new VBox();
        Label texto = new Label("Agregar Información de Personaje de Anime");
        GridPane formulario = new GridPane();
        formulario.setPadding(new Insets(10, 10, 10, 10));
        formulario.setVgap(6);
        formulario.setHgap(2);

        Label textoID = new Label("ID:");
        Label textoNombre = new Label("Nombre:");
        Label textoEdad = new Label("Edad:");
        Label textoAnime = new Label("Anime:");

        Spinner campoID = new Spinner();
        TextField campoNombre = new TextField();
        Spinner campoEdad = new Spinner();
        TextField campoAnime = new TextField();

        Button botonAgregar = new Button("Agregar");
        Button botonCancelar = new Button("Cancelar");

        GridPane.setConstraints(textoID, 0, 0);
        GridPane.setConstraints(campoID, 1, 0);

        GridPane.setConstraints(textoNombre, 0, 1);
        GridPane.setConstraints(campoNombre, 1, 1);

        GridPane.setConstraints(textoEdad, 0, 2);
        GridPane.setConstraints(campoEdad, 1, 2);

        GridPane.setConstraints(textoAnime, 0, 3);
        GridPane.setConstraints(campoAnime, 1, 3);

        GridPane.setConstraints(botonCancelar, 0, 5);
        GridPane.setConstraints(botonAgregar, 1, 5);

        formulario.getChildren().addAll(textoID, campoID, textoNombre, campoNombre, textoEdad, campoEdad, textoAnime, campoAnime, botonAgregar, botonCancelar);

        panelGeneral.getChildren().addAll(texto, formulario);

        Scene Escena = new Scene(panelGeneral);
        ventana.setScene(Escena);
        ventana.show();

        return personaje; 
    }

}
