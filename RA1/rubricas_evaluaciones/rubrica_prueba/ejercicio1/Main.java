import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Bienvenido al Hotel...");
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su rut");
        String rut = lector.next();
        System.out.println("Ingrese su nombre");
        String nombre = lector.next();
        System.out.println("Ingrese su tarjeta");
        String tarjeta = lector.next();

        Cliente c1 = new Cliente(rut, nombre, tarjeta);

        Habitacion h1 = new Habitacion(1, 2);
        Habitacion h2 = new Habitacion(2, 4);

        System.out.println("Ingrese una opcion:\n1.- habitacion 1 \n2.- habitacion 2");
        int opcion = lector.nextInt();
        System.out.println("Ingrese fecha de inicio");
        String fechaInicio = lector.next();
        System.out.println("Ingrese fecha de termino");
        String fechaTermino = lector.next();
        System.out.println("Ingrese cantidad de personas");
        int cantidad = lector.nextInt();

        Reserva reserva;
        if(opcion == 1)
            reserva = new Reserva(h1, c1, fechaInicio, fechaTermino, cantidad);
        else if(opcion == 2)
            reserva = new Reserva(h2, c1, fechaInicio, fechaTermino, cantidad);
        else 
            reserva = new Reserva(null, null, null, null, -1);

        System.out.println(">>> La reserva es para la habitacion: " + reserva.getHabitacion().getNumero() + " para el cliente: " + reserva.getCliente().getNombre() + " desde el " + reserva.getFechaInicio() + " hasta el " + reserva.getFechaTermino() + " para " + reserva.getCantidad() + " personas");


    }
}