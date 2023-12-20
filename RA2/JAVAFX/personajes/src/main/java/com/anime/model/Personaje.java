package com.anime.model;

public class Personaje {
    private int ID;
    private String nombre;
    private int edad;
    private String anime;

    public Personaje(int ID, String nombre, int edad, String anime){
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.anime = anime;
    }

    public Personaje getAll(){
        return this; //retornar toda la informacion
    }
}
