public class Habitacion{
    private int numero;
    private int capacidad;
    
    public Habitacion(int numero, int capacidad){
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero(){return this.numero;}
    public int getCapacidad(){return this.capacidad;}

    public void setNumero(int nuevoNumero){
        if(nuevoNumero > 0)
            this.numero = nuevoNumero;
    }

    public void setCapacidad(int nuevaCapacidad){
        if(nuevaCapacidad > 0)
            this.capacidad = nuevaCapacidad;
    }

}