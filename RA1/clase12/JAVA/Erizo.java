public class Erizo extends Animal{
    private int cantPuas;

    public Erizo(String nombre, String especie, String raza, int edad, double peso, int cantPuas){
        super(nombre, especie, raza, edad, peso);
        this.cantPuas = cantPuas;
    }

    public void seHaceBolita(){
        System.out.println(this.nombre + " se hace Bolita y te puede pinchar...");
    }
}