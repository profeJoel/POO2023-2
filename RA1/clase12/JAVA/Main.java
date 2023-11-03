public class Main{
    public static void main(String[] args) {
        Animal a1 = new Animal("a1", "sin especie", "sin raza", -1, -1);

        a1.move();
        a1.eat();
        a1.makeSound();

        Gato garfield = new Gato("Garfield", "felino", "Persa", 40, 20, 10);
        garfield.move();
        garfield.eat();
        garfield.makeSound();
        garfield.purr();

        Perro clifford = new Perro("Clifford", "canino", "Labrador", 2, 113, "puro");

        clifford.move();
        clifford.eat();
        clifford.makeSound();
        clifford.bark();

        Erizo sonic = new Erizo("Sonic", "Insectiboro", "Erizo Orejon", 15, 35, 6);

        sonic.move();
        sonic.eat();
        sonic.makeSound();
        sonic.seHaceBolita();

        //Generalizacion del uso de la herencia
        Animal[] lista = new Animal[4];

        lista[0] = a1;
        lista[1] = garfield;
        lista[2] = clifford;
        lista[3] = sonic;

        for(Animal a : lista){
            System.out.println("El animal " + a.nombre + " es " + a.especie);
            a.makeSound();
        }
    }
}