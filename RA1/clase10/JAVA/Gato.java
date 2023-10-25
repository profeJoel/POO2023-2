class Gato{
    //Atributos
    String name;
    String sex;
    int age;
    int weight;
    String color;
    String texture;

    //Metodos
    //El primer metodo es el Constructor
    //Permite instanciar a la clase, es decir, entrega la estructura y los metodos al objeto creado.
    Gato(String name, String sex, int age, int weight, String color, String texture){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
    }

    void eat(){
        System.out.println(this.name + " esta comiendo...");
    }
    void move(){
        System.out.println(this.name + " esta caminando...");
    }

    void meow(){
        System.out.println(this.name + " esta maullando...");
    }
    void purr(){
        System.out.println(this.name + " esta ronrroneando...");
    }

    void huntMice(){
        System.out.println(this.name + " esta cazando ratonesb...");
    }


}