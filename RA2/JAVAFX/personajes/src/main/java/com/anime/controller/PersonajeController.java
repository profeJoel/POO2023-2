package com.anime.controller;

import java.util.ArrayList;

import com.anime.model.Personaje;


public class PersonajeController {
    private ArrayList<Personaje> personajes;

    public PersonajeController(){
        this.personajes = new ArrayList<Personaje>();
    }

    public ArrayList<Personaje> getPersonajes(){
        return this.personajes;
    }
    
    public void addPersonaje(Personaje p){
        this.personajes.add(p);
    }
}
