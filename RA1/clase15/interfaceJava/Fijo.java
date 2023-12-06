package RA1.clase15.interfaceJava;
import java.util.Scanner;

public class Fijo implements Telefono{

    private String color;

    public Fijo(String color){
        this.color = color;
    }

    @Override
    public void haceLlamada(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Marque el telefono en las teclas del telefono");
        int numero = lector.nextInt();
        System.out.println("El numero que desea llamar es... "  + numero);
        System.out.println("Llamando... ");
    }

    @Override
    public void recibeLlamada(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ring ring ring... ");
        System.out.println("Opciones: \n 1.- si desea contestar\n 2.- si desea colgar");
        int opcion = 0;
        do{
            opcion = lector.nextInt();
        }while(opcion < 1 || opcion >2);
        if(opcion == 1)
            System.out.println("Recibe la llamada");
        else
            System.out.println("Cuelga la llamada");

    }
}