public class Cliente{
    private String rut;
    private String nombre;
    private String tarjeta;

    public Cliente(String rut, String nombre, String tarjeta){
        this.rut=rut;
        this.nombre=nombre;
        this.tarjeta=tarjeta;
    }

    public String getRut(){return this.rut;}
    public String getNombre(){return this.nombre;}
    public String getTarjeta(){return this.tarjeta;}

    //Setter de rut no permitido
    //Setter de nombre no permitido
    
    public void setTarjeta(String nuevaTarjeta){
        if(nuevaTarjeta.length() == 16)
            this.tarjeta = nuevaTarjeta;
    }
}