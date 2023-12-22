package com.anime;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
        controlador.addPersonaje(new Personaje(1, "Pikachu", 2, "Pokemon"));
        controlador.addPersonaje(new Personaje(2, "Piccolo", 100, "Dragon Ball"));

        ventana.setTitle("Proyecto Anime");
        VBox panelGeneral = new VBox();

        Label textoSuperior = new Label("Lista de Personajes de Anime");
//         TableView lista = new TableView();
//         lista.setEditable(true);
// /* 
//         TableColumn<Personaje, String> personajeID = new TableColumn("ID");
//         TableColumn<Personaje, String> personajeNombre = new TableColumn("Nombre");
//         TableColumn<Personaje, String> personajeEdad = new TableColumn("Edad");
//         TableColumn<Personaje, String> personajeAnime = new TableColumn("Anime");  */ 
        
//         TableColumn<Personaje, String> personajeID = new TableColumn<>("ID");
//         TableColumn<Personaje, String> personajeNombre = new TableColumn<>("Nombre");
//         TableColumn<Personaje, String> personajeEdad = new TableColumn<>("Edad");
//         TableColumn<Personaje, String> personajeAnime = new TableColumn<>("Anime"); 

//         // personajeID.setCellValueFactory(new PropertyValueFactory<Personaje, String>("id"));
//         // personajeNombre.setCellValueFactory(new PropertyValueFactory<Personaje, String>("nombre"));
//         // personajeEdad.setCellValueFactory(new PropertyValueFactory<Personaje, String>("edad"));
//         // personajeAnime.setCellValueFactory(new PropertyValueFactory<Personaje, String>("anime"));

//         /* personajeID.setCellValueFactory(c -> new SimpleStringProperty(new String(controlador.getPersonajes().listIterator().next().getId())));
//         personajeNombre.setCellValueFactory(c -> new SimpleStringProperty(new String(controlador.getPersonajes().listIterator().next().getNombre())));
//         personajeEdad.setCellValueFactory(c -> new SimpleStringProperty(new String(controlador.getPersonajes().listIterator().next().getEdad())));
//         personajeAnime.setCellValueFactory(c -> new SimpleStringProperty(new String(controlador.getPersonajes().listIterator().next().getAnime()))); */

//         personajeID.setCellValueFactory(new PropertyValueFactory<>("id"));
//         personajeNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
//         personajeEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
//         personajeAnime.setCellValueFactory(new PropertyValueFactory<>("anime"));

            
//         lista.getColumns().addAll(personajeID, personajeNombre, personajeEdad, personajeAnime);
//         lista.setItems(controlador.getPersonajes());
        
        // for(Personaje p : controlador.getPersonajes())
        //     lista.getItems().add(p); 

        ListView lista = new ListView();
        for(Personaje p : controlador.getPersonajes())
            lista.getItems().add(p.toString()); 


        

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