
public class Gato extends Animal{
    private int flexibilidad;

    public Gato(String nombre, String especie, String raza, int flexibilidad){
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.flexibilidad = flexibilidad;
    }

    public void haceSonido(){
        System.out.println(this.nombre + " maulla....");
    }
}
