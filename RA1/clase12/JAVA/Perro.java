public class Perro extends Animal{
    private String pedigri;

    public Perro(String nombre, String especie, String raza, int edad, double peso, String pedigri){
        super(nombre, especie, raza, edad, peso);
        this.pedigri = pedigri;
    }

    public void bark(){
        System.out.println(this.nombre + " esta ladrando...");
    }

    //Metodo por sobrecarga
    public void sleep(){
        System.out.println(this.nombre + " es un perro que duerme... zzz ");
    }

    @Override
    public void makeSound(){
        System.out.println(this.nombre + " hace guauu...");
    }
}