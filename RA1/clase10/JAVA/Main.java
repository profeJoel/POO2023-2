class Main{
    public static void main(String[] args) {
        //Como crear un objeto de la clase Gato
        Gato oscar = new Gato("Oscar", "macho", 3, 7, "marron", "rayado");

        Gato luna = new Gato("Luna", "hembra", 2, 5, "gris", "lisa");

        System.out.println("Los gatos nuevos se llaman " + oscar.name + " y " + luna.name);

        oscar.eat();
        luna.meow();
    }
}