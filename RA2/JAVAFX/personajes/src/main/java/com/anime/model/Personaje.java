package com.anime.model;

public class Personaje {
    private int id;
    private String nombre;
    private int edad;
    private String anime;

    public Personaje(int id, String nombre, int edad, String anime){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.anime = anime;
    }

    public String getId(){
        return String.valueOf(this.id);
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getEdad(){
        return String.valueOf(this.edad);
    }

    public String getAnime(){
        return this.anime;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setAnime(String anime){
        this.anime = anime;
    }

    public Personaje getAll(){
        return this; //retornar toda la informacion
    }
}
