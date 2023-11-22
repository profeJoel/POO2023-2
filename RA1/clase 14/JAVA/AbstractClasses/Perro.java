
public class Perro extends Animal{
    private int pedigri;

    public Perro(String nombre, String especie, String raza, int pedigri){
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.pedigri = pedigri;
    }

    public void haceSonido(){
        System.out.println(this.nombre + " ladra....");
    }
}

