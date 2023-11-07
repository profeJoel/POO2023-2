public class Gato extends Animal{
    private double flexibilidad;

    public Gato(String nombre, String especie, String raza, int edad, double peso, double flexibilidad){
        super(nombre, especie, raza, edad, peso); // es llamar al constructor de la super clase
        this.flexibilidad = flexibilidad;
    }

    public void purr(){
        System.out.println(this.nombre + " esta ronrroneando...");
    }

    //Metodo por sobrecarga
    public void sleep(){
        System.out.println(this.nombre + " es un gato que duerme... zzz ");
    }

    @Override
    public void makeSound(){
        System.out.println(this.nombre + " hace miauu...");
    }

}