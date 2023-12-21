package com.anime.controller;

import java.util.ArrayList;

import com.anime.model.Personaje;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PersonajeController {
    private ArrayList<Personaje> personajes;

    public PersonajeController(){
        this.personajes = new ArrayList<Personaje>();
    }

    public ObservableList<Personaje> getPersonajes(){
        ObservableList<Personaje> lista = FXCollections.observableArrayList(this.personajes);
        return lista;
    }
    
    public void addPersonaje(Personaje p){
        this.personajes.add(p);
        //System.out.println("> personaje: " + this.personajes.get(this.personajes.lastIndexOf(p)));

        for(Personaje x : this.personajes)
            System.out.println(x.getNombre());
    }
}
