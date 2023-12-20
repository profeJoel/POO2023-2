package com.anime;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import com.anime.controller.PersonajeController;
import com.anime.model.Personaje;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage ventana) throws IOException {

        PersonajeController controlador = new PersonajeController(); // el que maneja la informacion
        //Agregar informacion de Personaje
        controlador.addPersonaje(new Personaje(0, "Naruto", 15, "Naruto Shippuden"));

        ventana.setTitle("Proyecto Anime");
        VBox panelGeneral = new VBox();

        Label textoSuperior = new Label("Lista de Personajes de Anime");
        TableView lista = new TableView();
        lista.setEditable(true);

        TableColumn personajeID = new TableColumn("ID");
        personajeID.setCellValueFactory(new PropertyValueFactory<Personaje, int>("ID"));
        TableColumn personajeNombre = new TableColumn("Nombre");
        personajeNombre.setCellValueFactory(new PropertyValueFactory<Personaje,String>("nombre"));
        TableColumn personajeEdad = new TableColumn("Edad");
        personajeEdad.setCellValueFactory(new PropertyValueFactory<Personaje, int>("edad"));
        TableColumn personajeAnime = new TableColumn("Anime");
        personajeAnime.setCellValueFactory(new PropertyValueFactory<Personaje, String>("anime"));
        lista.setItems(controlador.getPersonajes());
        lista.getColumns().addAll(personajeID, personajeNombre, personajeEdad, personajeAnime);

        HBox panelBotones = new HBox();
        Button botonAgregar = new Button("Agregar Personaje");
        botonAgregar.setOnAction( e -> AgregarPersonaje.vista());
        Button botonSalir = new Button("Salir");
        botonSalir.setOnAction( e -> ventana.close());
        panelBotones.getChildren().addAll(botonAgregar, botonSalir);

        panelGeneral.getChildren().addAll(textoSuperior, lista, panelBotones);


        scene = new Scene(panelGeneral, 640, 480);
        ventana.setScene(scene);
        ventana.show();
    }


    public static void main(String[] args) {
        launch();
    }

}