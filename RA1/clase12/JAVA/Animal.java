public class Animal{
    protected String nombre;
    protected String especie;
    protected String raza;
    protected int edad;
    protected double peso;

    public Animal(String nombre, String especie, String raza, int edad, double peso){
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    //Ejemplo parametrico
    public Animal(){
        this.nombre = null;
        this.especie = null;
        this.raza = null;
        this.peso = -1;
        this.edad = -1;
    }

    public void move(){
        System.out.println(this.nombre + " se esta moviendo...");
    }

    public void eat(){
        System.out.println(this.nombre + " esta comiendo...");
    }

    //Metodo con polimorfismo parametrico
    public void eat(String food){
        System.out.println(this.nombre + " esta comiendo " + food);
    }


    public void makeSound(){
        System.out.println(this.nombre + " hace un sonido...");
    }
}