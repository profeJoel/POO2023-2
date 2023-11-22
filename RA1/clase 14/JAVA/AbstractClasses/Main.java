
public class Main {
    public static void main(String[] args) {
        Gato arigato = new Gato("Arigato", "felino", "angora", 50);
        Perro firulais = new Perro("Firulais", "canino", "Akita", 100);

        arigato.haceSonido();
        firulais.haceSonido();

        //Instanciar una objeto de Animal
        //Animal a = new Animal();
        
        Animal[] lista = new Animal[2];
        lista[0] = arigato;
        lista[1] = firulais;

        for(Animal a : lista){
            System.out.println("Animal " + a.nombre);
        }
    }
}
