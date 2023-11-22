import javax.print.attribute.HashAttributeSet;

public class Reserva{

    private Habitacion habitacion;
    private Cliente cliente;

    private String fechaInicio;
    private String fechaTermino;
    private int cantidadPersonas;

    public Reserva(Habitacion habitacion, Cliente cliente, String fechaInicio, String fechaTermino, int cantidadPersonas){
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.cantidadPersonas = cantidadPersonas;
    }

    public Habitacion getHabitacion(){return this.habitacion;}
    public Cliente getCliente(){return this.cliente;}
    public String getFechaInicio(){return this.fechaInicio;}
    public String getFechaTermino(){return this.fechaTermino;}
    public int getCantidad(){return this.cantidadPersonas;}

    public void setHabitacion(Habitacion nuevaHabitacion){
        this.habitacion = nuevaHabitacion;
    }

    //Setter de Cliente no permitido.

    public void setFechaInicio(String nuevaFechaInicio){
        this.fechaInicio = nuevaFechaInicio;
    }
    public void setFechaTermino(String nuevaFechaTermino){
        this.fechaTermino = nuevaFechaTermino;
    }
}