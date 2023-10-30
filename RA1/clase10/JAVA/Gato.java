public class Gato{
    //Atributos
    private String name;
    private String sex;
    int age;
    int weight;
    private String color;
    private String texture;

    //Metodos
    //El primer metodo es el Constructor
    //Permite instanciar a la clase, es decir, entrega la estructura y los metodos al objeto creado.
    public Gato(String name, String sex, int age, int weight, String color, String texture){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
    }

    public void eat(){
        System.out.println(this.name + " esta comiendo...");
    }
    public void move(){
        System.out.println(this.name + " esta caminando...");
    }

    public void meow(){
        System.out.println(this.name + " esta maullando...");
    }
    public void purr(){
        System.out.println(this.name + " esta ronrroneando...");
    }

    public void huntMice(){
        System.out.println(this.name + " esta cazando ratonesb...");
    }

    //Getters
    // Son metodos que permiten obtener informacion del objeto

    public String getName(){
        return this.name;
    }

    public String getSex(){
        return this.sex;
    }

    public String getColor(){
        return this.color;
    }

    public String getTexture(){
        return this.texture;
    }


    //Setters
    // Son metodos que permiten modificar o cambiar valores de los atributos de un objeto

    public void setName(String newName){
        this.name = newName;
    }
    public void setSex(String newSex){
        if(newSex == "macho" || newSex == "hembra")
            this.sex = newSex;
        else
            System.out.println("Cambio denegado...:(");
    }
    public void setColor(String newColor){
        if(newColor == "naranjo" || newColor == "blanco" || newColor == "negro" || newColor == "gris" || newColor == "marron")
            this.color = newColor;
        else
            System.out.println("Cambio denegado... :(");
    }

    public void setTexture(String newTexture){
        if(newTexture == "rayado" || newTexture == "lisa" || newTexture == "pelado")
            this.texture = newTexture;
        else
            System.out.println("Cambio denegado... :(");
    }

}