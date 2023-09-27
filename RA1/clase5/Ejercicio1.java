import java.util.Scanner;

class Ejercicio1{

    static int potencia(int base, int exp){
        int pot=1;
        for(; exp>0; exp--)
            pot *= base;
        return pot;
    }

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int b = lector.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exp = lector.nextInt();

        int resultado = potencia(b, exp);

        System.out.println("La potencia es: " + resultado);
    }
}