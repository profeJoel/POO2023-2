package com.anime.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.anime.model.Personaje;


public class PersonajeController {
    private ArrayList<Personaje> personajes;
    private String ruta;

    public PersonajeController(){
        this.personajes = new ArrayList<Personaje>();
        this.ruta = "src/main/resources/personajes.csv";
        this.loadPersonajes();
    }

    public ArrayList<Personaje> getPersonajes(){
        return this.personajes;
    }
    
    public void addPersonaje(Personaje p){
        this.personajes.add(p);
        this.recordNewPersonaje(p);
    }

    public void loadPersonajes(){

        String[] palabras;
        String linea;
        //Excepciones
        try{
            File basedatos = new File(this.ruta);
            Scanner lector = new Scanner(basedatos, "UTF-8");
            //System.out.println("> archivo conectado, listo para leer...");
            while(lector.hasNextLine()){
                //System.out.println(">>> cargando");

                linea = lector.nextLine();
                palabras = linea.split(",");

                // System.out.println(palabras[0] );
                // System.out.println(palabras[1] );
                // System.out.println(palabras[2] );
                // System.out.println(palabras[3]);
                this.personajes.add(new Personaje(Integer.parseInt(palabras[0].replace(" ", "")), palabras[1].replace('"', ' '), Integer.parseInt(palabras[2].replace(" ", "")), palabras[3].replace('"', ' ')));
            }
            lector.close();
            // for(Personaje p: this.personajes)
            //     System.out.println(p.toString());
                
            //System.out.println("cargados...");

        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
            e.printStackTrace();
        }
    }

    public void recordNewPersonaje(Personaje p){
        try{
            File archivo = new File(this.ruta);
            //true -> indica agregar texto al final de archivo
            //false -> indica sobreescritura de todo el documento.
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.append("\n" + p.getId() + ", " + p.getNombre() + ", " + p.getEdad() + ", " + p.getAnime());
            escritor.close();

        }catch(Exception e){
            System.out.println("El archivo no existe...");
            e.printStackTrace();
        }
    }
}
