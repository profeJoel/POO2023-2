import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        //Como crear un objeto de la clase Gato
        Gato oscar = new Gato("Oscar", "macho", 3, 7, "marron", "rayado");

        Gato luna = new Gato("Luna", "hembra", 2, 5, "gris", "lisa");

        System.out.println("Los gatos nuevos se llaman " + oscar.getName() + " y " + luna.getName());

        oscar.eat();
        luna.meow();

        //cambiar color
        Scanner lector = new Scanner(System.in);
        System.out.println("palabra: " + lector.nextLine());
        
        oscar.setColor(lector.next());
        System.out.println("El color del gato " + oscar.getName() +  " es " + oscar.getColor());
    }
}